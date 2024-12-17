package com.stocks.dto;

import com.stocks.ApiResponse.Industry.IndustryData;

import java.util.List;

public interface IndustryInfo {
    List<IndustryData> getIndustries();
}