package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("0")
	private String jsonMember0;

	@JsonProperty("1")
	private String jsonMember1;

	@JsonProperty("2")
	private String jsonMember2;

	@JsonProperty("3")
	private String jsonMember3;

	@JsonProperty("yqoQComp")
	private Object yqoQComp;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("lastIndex")
	private int lastIndex;

	@JsonProperty("value")
	private String value;

	@JsonProperty("qoQComp")
	private Object qoQComp;

	@JsonProperty("key")
	private String key;

	public void setJsonMember0(String jsonMember0){
		this.jsonMember0 = jsonMember0;
	}

	public String getJsonMember0(){
		return jsonMember0;
	}

	public void setJsonMember1(String jsonMember1){
		this.jsonMember1 = jsonMember1;
	}

	public String getJsonMember1(){
		return jsonMember1;
	}

	public void setJsonMember2(String jsonMember2){
		this.jsonMember2 = jsonMember2;
	}

	public String getJsonMember2(){
		return jsonMember2;
	}

	public void setJsonMember3(String jsonMember3){
		this.jsonMember3 = jsonMember3;
	}

	public String getJsonMember3(){
		return jsonMember3;
	}

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

	public void setLastIndex(int lastIndex){
		this.lastIndex = lastIndex;
	}

	public int getLastIndex(){
		return lastIndex;
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