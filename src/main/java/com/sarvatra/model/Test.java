package com.sarvatra.model;

import com.sarvatra.web.WebController;

public class Test {
	String hello;
	WebController webController;
	public String getHello() {
		return "hello";
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public WebController getWebController() {
		return webController;
	}

	public void setWebController(WebController webController) {
		this.webController = webController;
	}
	
}
