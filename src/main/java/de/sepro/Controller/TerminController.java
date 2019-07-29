package de.sepro.Controller;

import de.sepro.termin.Termin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RestController
public class TerminController {
	
	private Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/termin",
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public Termin getPerson() {
		log.debug("-> getPerson()");
		int id = 1;
		Date date = createDate("29","07","2019","15","00");
		String name = "Lukas Laaser";
		String info = "blank";
		
		log.debug("<- getPerson()");
		return new Termin(id, date, name, info);
	}
	
	private Date createDate(String day, String month, String year, String hours, String minutes) {
		log.debug("-> createDate(day={},month={},year={},hours={},minutes={})",day,month,year,hours,minutes);
		SimpleDateFormat isoFormat = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm");
		isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = null;
		try {
			date = isoFormat.parse(day+"-"+month+"-"+year+"T"+hours+":"+minutes);
		} catch (ParseException e) {
			log.error("Couldn´t parse date.",e);
		}
		log.debug("<- createDate(date={})", date);
		return date;
	}
	
}
