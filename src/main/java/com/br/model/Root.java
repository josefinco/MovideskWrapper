package com.br.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	@JsonProperty("type")
	public int getType() {
		return this.type;
	}

	public void settype(int type) {
		this.type = type;
	}

	int type;

	@JsonProperty("subject")
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	String subject;

	@JsonProperty("category")
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	String category;

	@JsonProperty("urgency")
	public String getUrgency() {
		return this.urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	String urgency;

	@JsonProperty("createdBy")
	public CreatedBy getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(CreatedBy createdBy) {
		this.createdBy = createdBy;
	}

	CreatedBy createdBy;

	@JsonProperty("clients")
	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	List<Client> clients;

	@JsonProperty("actions")
	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	List<Action> actions;
}
