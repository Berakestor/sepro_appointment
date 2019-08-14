package de.sepro.repository;

import de.sepro.appointment.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
@Transactional
public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
	List<Appointment> findByCustomerId(Long customerId);
	List<Appointment> findByEmployeeId(Long employeeId);
	List<Appointment> findByStatusId(Long statusId);
	List<Appointment> findByPartnerServiceId(Long partnerServiceId);
	List<Appointment> findByDate(LocalDate date);
	List<Appointment> findByDateAndStart(LocalDate date, LocalTime start);
	
}
