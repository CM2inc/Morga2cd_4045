package com.plantplaces.dto;

public class SpecimenDTO {
	
	private int specimenId;
	private String latitude;
	private String longitude;
	private String description;
	
	public int getSpecimenId() {
		return specimenId;
	}
	
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongtitude() {
		return longitude;
	}
	public void setLongtitude(String longtitude) {
		this.longitude = longtitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenId + " " + latitude + " " + longitude + " " + description;
	}

}
