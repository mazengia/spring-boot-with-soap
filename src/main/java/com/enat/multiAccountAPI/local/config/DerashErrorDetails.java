package com.enatbanksc.payment.exceptions;

import lombok.Data;

@Data
public class DerashErrorDetails extends ApiSubError{
    public String agent;
    public String confirmation_code;
    public String agent_tx_code;
}
