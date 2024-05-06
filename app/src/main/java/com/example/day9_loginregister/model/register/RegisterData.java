package com.example.day9_loginregister.model.register;

import com.google.gson.annotations.SerializedName;

public class RegisterData {

	@SerializedName("name")
	private String name;

	@SerializedName("username")
	private String username;

	public String getName(){
		return name;
	}

	public String getUsername(){
		return username;
	}
}