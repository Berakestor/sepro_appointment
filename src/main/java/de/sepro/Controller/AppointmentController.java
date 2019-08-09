package de.sepro.Controller;

import de.sepro.appointment.Appointment;
import de.sepro.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@RequestMapping(path="/termin")
public class AppointmentController {
	
	@Autowired
	
	private AppointmentRepository repository;
	
	@PostMapping(path="/add",
			consumes = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody String addNewUser (
				@RequestBody Appointment appointment) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		/*Appointment appointment = new Appointment();
		appointment.setCustomer_id((long) customer_id);
		appointment.setEmployee_id((long) employee_id);
		appointment.setStatus_id((long) status_id);
		appointment.setPartner_service_id((long) partner_service_id);
		appointment.setDate(LocalDate.parse(date));
		appointment.setStart(LocalTime.parse(start));
		appointment.setEnd(LocalTime.parse(end));*/
		
		Appointment appointment1 = new Appointment(appointment);
		repository.save(appointment);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Appointment> getAllUsers() {
		// This returns a JSON or XML with the users
		return repository.findAll();
	}
}
