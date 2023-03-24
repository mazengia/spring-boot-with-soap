package com.enat.multiAccountAPI.local.config;

import com.enat.multiAccountAPI.local.config.exception.ApiSubError;
import lombok.Data;

@Data
public class DerashErrorDetails extends ApiSubError {
    public String agent;
    public String confirmation_code;
    public String agent_tx_code;
}
