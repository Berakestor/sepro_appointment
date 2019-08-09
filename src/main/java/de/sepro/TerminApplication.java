package de.sepro;

import de.sepro.appointment.Appointment;
import de.sepro.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.invoke.MethodHandles;
import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class TerminApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	public static void main(String[] args) {
		SpringApplication.run(TerminApplication.class, args);
	}
	
	public CommandLineRunner demo (AppointmentRepository repository) {
		return(args) -> {
			repository.save(new Appointment((long) 1, (long) 1, (long) 1, (long) 1, LocalDate.now(), LocalTime.parse("15:00:00"), LocalTime.parse("16:00:00")));
		};
	}
	
	/*
	public void doit() {
		//backup
		
		// save a couple of Appointments
		repository.save(new Appointment((long) 1,(long) 1,(long) 2, LocalDate.now(), LocalTime.parse("15:30:00"), LocalTime.parse("16:00:00")));
		repository.save(new Appointment((long) 1,(long) 1,(long) 3, LocalDate.now(), LocalTime.parse("15:30:00"), LocalTime.parse("17:00:00")));
		
		// fetch all Appointment
		log.info("Appointments found with findAll():");
		for (Appointment customer : repository.findAll()) {
			log.info(customer.toString());
		}
		log.info("");
		
		// fetch an individual Appointment by ID
		repository.findById(1L)
				.ifPresent(customer -> {
					log.info("Customer found with findById(1L):");
					log.info(customer.toString());
					log.info("");
				});
		
		// fetch Appointment by customer
		log.info("Customer found with findByLastName('Bauer'):");
		repository.findByCustomer_id((long) 1).forEach(bauer -> {
			log.info(bauer.toString());
		});
		log.info("");
	}
	 */
	
}
