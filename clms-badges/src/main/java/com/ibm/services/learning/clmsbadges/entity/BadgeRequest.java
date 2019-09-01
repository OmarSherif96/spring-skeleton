package com.ibm.services.learning.clmsbadges.entity;

public class BadgeRequest {
	private String userEmail;
	private String badgeTemplateId;
	private String courseId;
	private String courseTitle;
	private String requestorEmail;
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBadgeTemplateId() {
		return badgeTemplateId;
	}
	public void setBadgeTemplateId(String badgeTemplateId) {
		this.badgeTemplateId = badgeTemplateId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getRequestorEmail() {
		return requestorEmail;
	}
	public void setRequestorEmail(String requestorEmail) {
		this.requestorEmail = requestorEmail;
	}
	
}
