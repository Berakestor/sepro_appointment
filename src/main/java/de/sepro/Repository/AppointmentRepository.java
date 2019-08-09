package de.sepro.repository;

import de.sepro.appointment.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
	
	/*
	List<Appointment> findBySector_id(Long sector_id);
	List<Appointment> findByPartner_service_id(Long partner_service_id);
	List<Appointment> findByCustomer_id(Long customer_id);
	List<Appointment> findByDate(LocalDate date);
	List<Appointment> findByDateAndStart(LocalDate date, LocalTime start);
	 */
}
