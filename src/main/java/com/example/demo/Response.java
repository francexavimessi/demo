package com.example.demo;

public class Response {

    private String loginStatus = "success";

    private Object data;

//    private String error;

//    private int statusCode = 200;

//    public Response(User user) {
//		// TODO Auto-generated constructor stub
//	}
	// Constructor, getters and setters omitted
    public void setloginStatus(String loginStatus) {
	      this.loginStatus = loginStatus;
	   }
    public void setObject(String data) {
	      this.data = data;
	   }
}