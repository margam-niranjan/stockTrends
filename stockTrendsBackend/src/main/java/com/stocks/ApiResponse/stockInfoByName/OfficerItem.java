package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OfficerItem{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("rank")
	private int rank;

	@JsonProperty("mI")
	private String mI;

	@JsonProperty("title")
	private Title title;

	@JsonProperty("age")
	private String age;

	@JsonProperty("since")
	private String since;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setMI(String mI){
		this.mI = mI;
	}

	public String getMI(){
		return mI;
	}

	public void setTitle(Title title){
		this.title = title;
	}

	public Title getTitle(){
		return title;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}

	public void setSince(String since){
		this.since = since;
	}

	public String getSince(){
		return since;
	}
}