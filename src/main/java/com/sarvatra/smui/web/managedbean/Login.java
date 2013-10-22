package com.sarvatra.smui.web.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name="loginAction")
@RequestScoped
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4447936513113386495L;
	String userName="Enter user name";
	String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login(String userName, String password){
		System.out.println("****************managed bean login");
		HttpServletRequest request = (HttpServletRequest) FacesContext  
                .getCurrentInstance().getExternalContext().getRequest();  
		try {
			request.login(userName, password);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/home.xhtml";
	}
}
