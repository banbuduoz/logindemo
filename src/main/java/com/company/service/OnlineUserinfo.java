package com.company.service;

import java.io.Serializable;

public class OnlineUserinfo implements Serializable {

	private static final long serialVersionUID = 5934249695740499037L;
	private String username;
	private String token;
	private int role;
	private long lastResetTime = 0;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public long getLastResetTime() {
		return lastResetTime;
	}

	public void setLastResetTime(long lastResetTime) {
		this.lastResetTime = lastResetTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
