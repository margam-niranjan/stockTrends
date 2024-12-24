package com.stocks.ApiResponse.nseMostActive;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Bonus{

	@JsonProperty("msg")
	private String msg;

	@JsonProperty("data")
	private List<List<String>> data;

	@JsonProperty("header")
	private List<String> header;

	@JsonProperty("title")
	private String title;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setData(List<List<String>> data){
		this.data = data;
	}

	public List<List<String>> getData(){
		return data;
	}

	public void setHeader(List<String> header){
		this.header = header;
	}

	public List<String> getHeader(){
		return header;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
}