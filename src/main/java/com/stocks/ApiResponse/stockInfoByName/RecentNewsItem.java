package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecentNewsItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("timeToRead")
	private String timeToRead;

	@JsonProperty("thumbnailimage")
	private String thumbnailimage;

	@JsonProperty("id")
	private String id;

	@JsonProperty("headline")
	private String headline;

	@JsonProperty("url")
	private String url;

	@JsonProperty("listimage")
	private String listimage;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setTimeToRead(String timeToRead){
		this.timeToRead = timeToRead;
	}

	public String getTimeToRead(){
		return timeToRead;
	}

	public void setThumbnailimage(String thumbnailimage){
		this.thumbnailimage = thumbnailimage;
	}

	public String getThumbnailimage(){
		return thumbnailimage;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setHeadline(String headline){
		this.headline = headline;
	}

	public String getHeadline(){
		return headline;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setListimage(String listimage){
		this.listimage = listimage;
	}

	public String getListimage(){
		return listimage;
	}
}