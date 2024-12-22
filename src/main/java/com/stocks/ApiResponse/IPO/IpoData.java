package com.stocks.ApiResponse.IPO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IpoData{

	@JsonProperty("listed")
	private List<ListedItem> listed;

	@JsonProperty("active")
	private List<ActiveItem> active;

	@JsonProperty("closed")
	private List<ClosedItem> closed;

	@JsonProperty("upcoming")
	private List<UpcomingItem> upcoming;

	public void setListed(List<ListedItem> listed){
		this.listed = listed;
	}

	public List<ListedItem> getListed(){
		return listed;
	}

	public void setActive(List<ActiveItem> active){
		this.active = active;
	}

	public List<ActiveItem> getActive(){
		return active;
	}

	public void setClosed(List<ClosedItem> closed){
		this.closed = closed;
	}

	public List<ClosedItem> getClosed(){
		return closed;
	}

	public void setUpcoming(List<UpcomingItem> upcoming){
		this.upcoming = upcoming;
	}

	public List<UpcomingItem> getUpcoming(){
		return upcoming;
	}
}