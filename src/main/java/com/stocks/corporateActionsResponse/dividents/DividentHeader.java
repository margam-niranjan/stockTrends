package com.stocks.corporateActionsResponse.dividents;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DividentHeader {
    private Map<Integer,String> agenda;
}
