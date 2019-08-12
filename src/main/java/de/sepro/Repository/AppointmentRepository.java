package de.sepro.repository;

import de.sepro.appointment.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
	
	List<Appointment> findAllByCustomerID(Long customerID);
	List<Appointment> findByEmployeeId(Long employeeId);
	List<Appointment> findByStatusId(Long statusId);
	List<Appointment> findByPartnerServiceId(Long partnerServiceId);
	List<Appointment> findByDate(LocalDate date);
	
}
