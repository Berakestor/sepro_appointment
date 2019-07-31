package de.sepro.termin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date date;
	private String user;
	private String info;
	
	public Appointment() {}
	
	public Appointment(Date date, String user, String info) {
		this.date = date;
		this.user = user;
		this.info = info;
	}
	
	public Long getId() {
		return id;
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
	
	@Override
	public String toString() {
		return String.format("Appointment[id=%d, date='%s', user='%s', info='%s']", id, date.toString(), user, info);
	}
}
