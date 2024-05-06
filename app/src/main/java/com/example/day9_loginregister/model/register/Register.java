package com.example.day9_loginregister.model.register;

import com.google.gson.annotations.SerializedName;

public class Register{

	@SerializedName("data")
	private RegisterData data;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public RegisterData getData(){
		return data;
	}

	public String getMessage(){
		return message;
	}

	public boolean isStatus(){
		return status;
	}
}