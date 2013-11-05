package com.sarvatra.smui.web.managedbean;

import java.io.Serializable;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import com.sarvatra.smui.services.SecurityService;
import com.sarvatra.smui.services.model.security.SecurityHelper;


public class LoginMBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4447936513113386495L;
	String userName;
	String password;
	
	private SecurityHelper securityHelper;
	
	private SecurityService securityService;
	
	public SecurityHelper getSecurityHelper() {
		return securityHelper;
	}

	public void setSecurityHelper(SecurityHelper securityHelper) {
		this.securityHelper = securityHelper;
	}

	public SecurityService getSecurityService() {
		return securityService;
	}

	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

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

	public String login(){
		System.out.println("****************managed bean login");
		HttpServletRequest request = (HttpServletRequest) FacesContext  
                .getCurrentInstance().getExternalContext().getRequest();  
		boolean success = securityService.login(userName, password);
		System.out.println("********** login success ************" + success);
		
		return "home";
	}
}
