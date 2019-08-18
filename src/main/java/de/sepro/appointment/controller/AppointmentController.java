package de.sepro.appointment.controller;

import de.sepro.appointment.entity.Appointment;
import de.sepro.appointment.repository.AppointmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/appointment")
public class AppointmentController {
	
	private final AppointmentRepository repository;
	
	public AppointmentController(AppointmentRepository repository) {
		this.repository = repository;
	}
	
	/**
	 * Adds a new Appointment to the database.
	 * @param appointment - Appointment in Json format
	 * @return String "saved"
	 */
	@PostMapping(path="/addAppointment",
				consumes = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody String addAppointment (@RequestBody Appointment appointment) {
		repository.save(appointment);
		return "Saved Appointment";
	}
	
	/**
	 * Returns all appointments in JSON Format
	 * @return All Appointments in JSON format
	 */
	@GetMapping(path="/getAllAppointments")
	public @ResponseBody Iterable<Appointment> getAllAppointments() {
		return repository.findAll();
	}
	
	/**
	 * Returns Appointment found by ID
	 * @param id - Id of Appointment
	 * @return Appointment
	 */
	@GetMapping(path="/findById")
	public @ResponseBody Optional<Appointment> getById(@RequestParam Long id) {
		return repository.findById(id);
	}
	
	/**
	 * Returns a List, containing all Appointments connected to the given customerId.
	 * @param customerId - customerId
	 * @return List of Appointments with customerId
	 */
	@GetMapping(path="/findByCustomerId")
	public @ResponseBody List<Appointment> findByCustomerId(@RequestParam Long customerId) {
		return repository.findByCustomerId(customerId);
	}
	
	/**
	 * Returns a List, containing all Appointments connected to the given employeeId
	 * @param employeeId - Id of employee
	 * @return List of appointments with employeeId
	 */
	@GetMapping(path="/findByEmployeeId")
	public @ResponseBody List<Appointment> findByEmployeeId(@RequestParam Long employeeId) {
		return repository.findByEmployeeId(employeeId);
	}
	
	/**
	 * Returns a List, containing all Appointments connected to the given statusId
	 * @param statusId - Id of status
	 * @return List of appointments with statusId
	 */
	@GetMapping(path="/findByStatusId")
	public @ResponseBody List<Appointment> findByStatusId(@RequestParam Long statusId) {
		return repository.findByStatusId(statusId);
	}
	
	/**
	 * Returns a List, containing all Appointments connected to the given partnerServiceId
	 * @param partnerServiceId - Id of partnerService
	 * @return List of appointments with partnerServiceId
	 */
	@GetMapping(path="/findByPartnerServiceId")
	public @ResponseBody List<Appointment> findByPartnerServiceId(@RequestParam Long partnerServiceId) {
		return repository.findByPartnerServiceId(partnerServiceId);
	}
	
	
	
	/*TODO:----Doesnt work yet----*/
	
	/**
	 * Returns a List, containing all Appointments connected to the given date
	 * @param date - date
	 * @return List of appointments with date
	 */
	@GetMapping(path="/findByDate",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Appointment> findByDate(@RequestBody LocalDate date) {
		return repository.findByDate(date);
	}
	
	/**
	 * Returns a List, containing all Appointments connected to the given date and starting time.
	 * @param date - date
	 * @param start - Starting time of Appointment
	 * @return List of appointments
	 */
	@GetMapping(path="/findByDateAndStart",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Appointment> findByDateAndStart(@RequestBody  LocalDate date, @RequestBody LocalTime start) {
		return repository.findByDateAndStart(date, start);
	}
	
	//TODO: Really important for Search
	
	/**
	 * Returns a List, containing all Appointments connected to the given date
	 * @param date - date
	 * @return List of appointments with date
	 */
	@GetMapping(path="/findByPartnerIdAndDate",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Appointment> findByPartnerIdAndDate(@RequestBody Long partnerId, @RequestBody LocalDate date) {
		return repository.findByPartnerIdAndDate(partnerId, date);
	}
}
