package com.br.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Action {
	@JsonProperty("type")
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	int type;

	@JsonProperty("origin")
	public int getOrigin() {
		return this.origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	int origin;

	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	String description;

	@JsonProperty("attachments")
	public List<Object> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(List<Object> attachments) {
		this.attachments = attachments;
	}

	List<Object> attachments;
}
