package com.stocks.ApiResponse.HistoricalStats.null;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailItem{

	@JsonProperty("msg")
	private String msg;

	@JsonProperty("loc")
	private List<String> loc;

	@JsonProperty("input")
	private Object input;

	@JsonProperty("type")
	private String type;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setLoc(List<String> loc){
		this.loc = loc;
	}

	public List<String> getLoc(){
		return loc;
	}

	public void setInput(Object input){
		this.input = input;
	}

	public Object getInput(){
		return input;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}