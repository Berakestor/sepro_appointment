package de.sepro.termin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Date;

public class Termin {
	
	Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private Date date;
	String user;
	String info;
	int ID;
	
	public Termin(Date date, String user, String info, int ID) {
		this.date = date;
		this.user = user;
		this.info = info;
		this.ID = ID;
	}
}
