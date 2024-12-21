package com.stocks.ApiResponse.IPO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stocks.ApiResponse.IPO.activeIpo.ActiveIpoData;
import com.stocks.ApiResponse.IPO.closedIpo.ClosedIpoData;
import com.stocks.ApiResponse.IPO.listedIpo.ListedIpoData;
import com.stocks.ApiResponse.IPO.upcomingIpo.UpcomingIpoData;

import java.util.List;

public class IpoData {

  @JsonProperty("upcoming")
  private List<UpcomingIpoData> upcoming;

  @JsonProperty("listed")
  private List<ListedIpoData> listed;

  @JsonProperty("active")
   private List<ActiveIpoData> active;

  @JsonProperty("closed")
   private List<ClosedIpoData> closed;


}