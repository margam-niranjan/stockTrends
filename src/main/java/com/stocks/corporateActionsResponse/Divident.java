package com.stocks.corporateActionsResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stocks.corporateActionsResponse.dividents.DividentData;
import com.stocks.corporateActionsResponse.dividents.DividentHeader;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Divident {
    private String msg;
    private String title;
    private DividentHeader dividentHeader;
    private DividentData data;

}
