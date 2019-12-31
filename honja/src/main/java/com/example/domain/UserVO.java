package com.example.domain;

import java.util.Date;

public class UserVO {
	private String uid;
	private String upw;
	private String uname;
	private int upoint;
	private String session_key;
	private Date session_limit;
	private String uimg;
	private Date uemail;
	private Date joinu_date;
	private Date loginu_date;
	private String usignature;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUpoint() {
		return upoint;
	}
	public void setUpoint(int upoint) {
		this.upoint = upoint;
	}
	public String getSession_key() {
		return session_key;
	}
	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}
	public Date getSession_limit() {
		return session_limit;
	}
	public void setSession_limit(Date session_limit) {
		this.session_limit = session_limit;
	}
	public String getUimg() {
		return uimg;
	}
	public void setUimg(String uimg) {
		this.uimg = uimg;
	}
	public Date getUemail() {
		return uemail;
	}
	public void setUemail(Date uemail) {
		this.uemail = uemail;
	}
	public Date getJoinu_date() {
		return joinu_date;
	}
	public void setJoinu_date(Date joinu_date) {
		this.joinu_date = joinu_date;
	}
	public Date getLoginu_date() {
		return loginu_date;
	}
	public void setLoginu_date(Date loginu_date) {
		this.loginu_date = loginu_date;
	}
	public String getUsignature() {
		return usignature;
	}
	public void setUsignature(String usignature) {
		this.usignature = usignature;
	}
	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", upoint=" + upoint + ", session_key="
				+ session_key + ", session_limit=" + session_limit + ", uimg=" + uimg + ", uemail=" + uemail
				+ ", joinu_date=" + joinu_date + ", loginu_date=" + loginu_date + ", usignature=" + usignature + "]";
	}
	
	
}
