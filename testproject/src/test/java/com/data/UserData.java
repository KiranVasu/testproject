package com.data;

public enum UserData {

	VALIDUSER("test", "test");

	private String username;
	private String password;

	UserData(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUserName() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
