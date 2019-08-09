package de.sepro.Controller;

import de.sepro.appointment.Appointment;
import de.sepro.repository.AppointmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/appointment")
public class AppointmentController {
	
	private final AppointmentRepository repository;
	
	public AppointmentController(AppointmentRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(path="/add",
			consumes = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody String addNewUser (
				@RequestBody Appointment appointment) {
		repository.save(appointment);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Appointment> getAllUsers() {
		// This returns a JSON or XML with the users
		return repository.findAll();
	}
	
	@GetMapping(path="/getTest")
	public @ResponseBody Iterable<Appointment> getTest() {
		// This returns a JSON or XML with the users
		return repository.findAllByCustomerID((long) 1);
	}
	
	
}
