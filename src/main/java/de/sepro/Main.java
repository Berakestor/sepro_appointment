package de.sepro;

import de.sepro.termin.TerminHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
	
	public static void main(String args[]) {
		
		TerminHandler.createTermin();
		
	}
	
	
	private void dodate() {
		SimpleDateFormat isoFormat = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss");
		isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			Date date = isoFormat.parse("24-07-2019T16:03:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
