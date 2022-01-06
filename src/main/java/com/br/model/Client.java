package com.br.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Client {
	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@JsonProperty("personType")
	public int getPersonType() {
		return this.personType;
	}

	public void setPersonType(int personType) {
		this.personType = personType;
	}

	int personType;

	@JsonProperty("profileType")
	public int getProfileType() {
		return this.profileType;
	}

	public void setProfileType(int profileType) {
		this.profileType = profileType;
	}

	int profileType;
}