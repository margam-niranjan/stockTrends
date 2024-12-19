package com.stocks.ApiResponse.PriceShockers;

import java.util.List;

public class PriceShockersData {
    List<BsePriceShockers> bsePriceShockers;
    List<NsePriceShockers> nsePriceShockers;

    public List<BsePriceShockers> getBsePriceShockers() {
        return bsePriceShockers;
    }

    public void setBsePriceShockers(List<BsePriceShockers> bsePriceShockers) {
        this.bsePriceShockers = bsePriceShockers;
    }

    public List<NsePriceShockers> getNsePriceShockers() {
        return nsePriceShockers;
    }

    public void setNsePriceShockers(List<NsePriceShockers> nsePriceShockers) {
        this.nsePriceShockers = nsePriceShockers;
    }
}
