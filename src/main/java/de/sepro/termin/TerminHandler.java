package de.sepro.termin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Date;

public class TerminHandler {
	
	private static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	public static void createTermin(Date date, String user, String info, int ID) {
		log.debug("-> createTermin() {date={}, user={}, info={}, id={}", date, user, info, ID);
		Termin termin = new Termin(ID, date, user, info);
		log.debug("<- createTermin()");
	}
	
	public static void deleteTermin(int ID) {
		log.debug("-> deleteTermin() {id={}", ID);
		log.debug("<- deleteTermin()");
	}
	
	public static void deleteTermin(Termin termin) {
		log.debug("-> deleteTermin() {termin={}", termin);
		log.debug("<- deleteTermin()");
	}
	
	public static Termin searchTermin(int ID) {
		log.debug("-> searchTermin() {id={}", ID);
		
		Termin termin = null;
		
		log.debug("<- searchTermin() {Termin={}", termin);
		return termin;
	}
	
}
