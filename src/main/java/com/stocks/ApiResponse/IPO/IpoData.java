package com.stocks.ApiResponse.IPO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stocks.ApiResponse.IPO.activeIpo.ActiveIpoData;
import com.stocks.ApiResponse.IPO.closedIpo.ClosedIpoData;
import com.stocks.ApiResponse.IPO.listedIpo.ListedIpoData;
import com.stocks.ApiResponse.IPO.upcomingIpo.UpcomingIpoData;



public class Ipodata {
  UpcomingIpoData upcoming;
  ListedIpoData listed;
  ActiveIpoData active;
  ClosedIpoData closed;

}
