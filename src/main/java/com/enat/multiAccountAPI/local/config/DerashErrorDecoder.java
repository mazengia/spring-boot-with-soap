package com.enatbanksc.payment.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.io.InputStream;
@Log4j2
public class DerashErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        DerashError derashError;
        try (InputStream errorBody = response.body().asInputStream()) {
            var mapper = new ObjectMapper();
            log.error("Raw Derash error {}", response.body());
            derashError = mapper.readValue(errorBody, DerashError.class);
            log.error("Parsed Derash Error {}",derashError);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse Derash Error {}", e);
        }
        return switch (response.status()) {
            case 400 -> new BadRequestException();
            case 402 -> new BillAlreadyPaidException(derashError);
            case 404 -> new BillNotFoundException(derashError);
            case 403 -> new BillExpiredException(derashError);
            default -> new Exception("Exception while talking to derash");
        };
    }
}
