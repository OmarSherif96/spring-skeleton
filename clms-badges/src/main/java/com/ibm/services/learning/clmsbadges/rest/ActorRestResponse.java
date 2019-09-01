package com.ibm.services.learning.clmsbadges.rest;

import java.util.ArrayList;

public class ActorRestResponse {
	private int status;
	private String message;
	private long timeStamp;
//	private ArrayList<String> statements = new ArrayList<>();
//	
//	public ArrayList<String> getStatements() {
//		return statements;
//	}
//	public void setStatements(ArrayList<String> statements) {
//		this.statements = statements;
//	}
	public ActorRestResponse() {
		
	}
	public ActorRestResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
