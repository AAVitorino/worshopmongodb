package com.teste.mongo.demo.domain.services.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.teste.mongo.demo.resources.exception.StandardError;

public class ErrorDetail {

    private String title;
    private int status;
    private String detail;
    private long timeStamp;
    private String developerMessage;
    private Map<String, List<StandardError>> errors = new HashMap<>();
    public ErrorDetail() {
    	
    }
	public ErrorDetail(String title, int status, String detail, long timeStamp, String developerMessage,
			Map<String, List<StandardError>> errors) {
		super();
		this.title = title;
		this.status = status;
		this.detail = detail;
		this.timeStamp = timeStamp;
		this.developerMessage = developerMessage;
		this.errors = errors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getDeveloperMessage() {
		return developerMessage;
	}
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	public Map<String, List<StandardError>> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, List<StandardError>> errors) {
		this.errors = errors;
	}
    
    
    
}
