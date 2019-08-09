package de.sepro.repository;

import de.sepro.appointment.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
	
	//List<Appointment> findAllByCustomer_id(Long customer_id);
	
	Iterable<Appointment> findAllByCustomerID(Long customerID);
	
	//TODO: Der Idiot checkt nicht das das "_id" dazugehört..
	//TODO: Umschreiben aller Variabelen und "_" herausnehmen.
	//List<Appointment> findByEmployee_id(Long employee_id);
	//List<Appointment> findByStatus_id(Long status_id);
	//List<Appointment> findByPartner_service_id(Long partner_service_id);
	//List<Appointment> findByDate(LocalDate date);
}
