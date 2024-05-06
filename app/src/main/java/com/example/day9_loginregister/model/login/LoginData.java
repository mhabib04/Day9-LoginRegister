package com.example.day9_loginregister.model.login;

import com.google.gson.annotations.SerializedName;

public class LoginData {

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("username")
	private String username;

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getUsername(){
		return username;
	}
}