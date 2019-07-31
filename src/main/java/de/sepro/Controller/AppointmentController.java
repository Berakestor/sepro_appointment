package de.sepro.Controller;

import de.sepro.Database;
import de.sepro.termin.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.invoke.MethodHandles;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
public class AppointmentController {
	
	private Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private Database database = new Database();
	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/getAppointmentFromID",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Appointment getTAppointmentFromID(@RequestParam(value="id") long id) {
		log.debug("-> getAppointment(id={})", id);
		Appointment AppointmentFromID = database.getAppointmentFromID(id);
		log.debug("<- getAppointment(Appointment={})", AppointmentFromID);
		return AppointmentFromID;
	}
	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/getAllAppointments",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void getAllAppointments() {
		List<Appointment> dblist = database.getDblist();
		for (Appointment appointment : dblist) {
	
			
			
		}
	}
	

	@RequestMapping(
			method = RequestMethod.POST,
			path= "/addTermin")
	@ResponseBody
	public int addTermin(HttpServletRequest request,
						  @RequestParam(value="date") Date date,
						  @RequestParam(value="user") String user,
						  @RequestParam(value="info") String info) {
		log.debug("-> addTermin(request={}, date={}, user={}, info={})",request, date, user, info);
		Appointment appointment = new Appointment(date, user, info);
		database.addToDatabase(appointment);
		log.debug("<- addTermin()");
		return 0;
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
