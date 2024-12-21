package com.stocks.ApiResponse.IPO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stocks.ApiResponse.IPO.activeIpo.ActiveIpoData;
import com.stocks.ApiResponse.IPO.closedIpo.ClosedIpoData;
import com.stocks.ApiResponse.IPO.listedIpo.ListedIpoData;
import com.stocks.ApiResponse.IPO.upcomingIpo.UpcomingIpoData;

import java.util.List;

public class IpoData {

  @JsonProperty("upcoming")
  UpcomingIpoData upcoming;

  @JsonProperty("listed")
  ListedIpoData listed;

  @JsonProperty("active")
  ActiveIpoData active;

  @JsonProperty("closed")
  ClosedIpoData closed;

  
}