package com.sninfotech.app.model;

import lombok.Data;

@Data

public class CaptchaResponse {
	private boolean success;
	private String challenge_ts;
	private String hostname;
	public CaptchaResponse() {
		super();
	}
	public CaptchaResponse(boolean success, String challenge_ts, String hostname) {
		super();
		this.success = success;
		this.challenge_ts = challenge_ts;
		this.hostname = hostname;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getChallenge_ts() {
		return challenge_ts;
	}
	public void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	
}
