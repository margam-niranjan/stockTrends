package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class INCItem{

	@JsonProperty("yqoQComp")
	private Object yqoQComp;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("value")
	private String value;

	@JsonProperty("qoQComp")
	private Object qoQComp;

	@JsonProperty("key")
	private String key;

	public void setYqoQComp(Object yqoQComp){
		this.yqoQComp = yqoQComp;
	}

	public Object getYqoQComp(){
		return yqoQComp;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setQoQComp(Object qoQComp){
		this.qoQComp = qoQComp;
	}

	public Object getQoQComp(){
		return qoQComp;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}
}