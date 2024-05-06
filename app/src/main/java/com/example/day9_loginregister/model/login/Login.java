package com.example.day9_loginregister.model.login;

import com.google.gson.annotations.SerializedName;

public class Login{

	@SerializedName("data")
	private LoginData data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public LoginData getData(){
		return data;
	}

	public String getMessage(){
		return message;
	}

	public boolean isStatus(){
		return status;
	}
}