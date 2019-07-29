package de.sepro.termin;

import java.util.Date;

public class Termin {
	
	private int id;
	private Date date;
	private String user;
	private String info;
	
	public Termin( int id, Date date, String user, String info) {
		this.id = id;
		this.date = date;
		this.user = user;
		this.info = info;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}

}
