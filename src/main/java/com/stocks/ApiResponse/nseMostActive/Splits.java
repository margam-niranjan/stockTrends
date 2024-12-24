package com.stocks.ApiResponse.nseMostActive;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Splits{

	@JsonProperty("msg")
	private String msg;

	@JsonProperty("title")
	private String title;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
}