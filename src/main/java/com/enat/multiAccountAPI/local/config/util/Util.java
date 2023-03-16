package com.enat.multiAccountAPI.local.config.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

import java.beans.FeatureDescriptor;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class Util {
    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
        return Stream.of(wrappedSource.getPropertyDescriptors())
                .map(FeatureDescriptor::getName)
                .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null || propertyName.equals("id"))
                .toArray(String[]::new);
    }

    public static String getEmployeeID(JwtAuthenticationToken token) {
        return (String) token.getTokenAttributes().get("employeeID");
    }

}
