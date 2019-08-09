package de.sepro.Controller;

import de.sepro.appointment.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.invoke.MethodHandles;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class AppointmentController {
	
	private Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	//Add appointment
	@RequestMapping(
			method = RequestMethod.POST,
			path= "/addTermin" )
	@ResponseBody
	public int addTermin(HttpServletRequest request,
						 @RequestParam(value="customer_id") Long customer_id,
						 @RequestParam(value="employee_id") Long employee_id,
						 @RequestParam(value="status_id") Long status_id,
						 @RequestParam(value="partner_service_id") Long partner_service_id,
						 @RequestParam(value="date") LocalDate date,
						 @RequestParam(value="start") LocalTime start,
						 @RequestParam(value="end") LocalTime end) {
		log.debug("-> addTermin(request={}, customer_id={}, employee_id={}, status_id={}, partner_service_id={}, date={}, start={}, end={})",
				request, customer_id, employee_id, status_id, partner_service_id, date, start, end);
		Appointment appointment = new Appointment(customer_id, employee_id, status_id, partner_service_id, date, start, end);
		log.debug("<- addTermin()");
		return 0;
	}
}
