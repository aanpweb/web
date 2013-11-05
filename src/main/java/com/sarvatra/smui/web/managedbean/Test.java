package com.sarvatra.smui.web.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="test")
@RequestScoped
public class Test {
	private String string1;
	private String string2;
	private List<String> strings;
	public String getString1() {
		return "string1";
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return "string2";
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public List<String> getStrings() {
		strings = new ArrayList<String>();
		for(int i=0 ; i<10; i++){
			strings.add("strings : " + i);
		}
		return strings;
	}
	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
	
	public void loadString(){
		string1 = "value1";
		string2 = "value2";
		strings = new ArrayList<String>();
		for(int i=0 ; i<10; i++){
			strings.add("strings : " + i);
		}
	}
}
