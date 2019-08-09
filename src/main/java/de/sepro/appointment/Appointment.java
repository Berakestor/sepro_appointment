package de.sepro.appointment;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long customer_id;
	private Long employee_id;
	private Long status_id;
	private Long partner_service_id;
	private LocalDate date;
	private LocalTime start;
	private LocalTime end;
	
	public Appointment() {}
	
	public Appointment(Appointment appointment) {
		this.customer_id = appointment.getCustomer_id();
		this.employee_id = appointment.getEmployee_id();
		this.status_id = appointment.getStatus_id();
		this.partner_service_id = appointment.getPartner_service_id();
		this.date = appointment.getDate();
		this.start = appointment.getStart();
		this.end = appointment.getEnd();
	}
	
	public Appointment(Long customer_id, Long employee_id, Long status_id, Long partner_service_id, LocalDate date, LocalTime start, LocalTime end) {
		this.customer_id = customer_id;
		this.employee_id = employee_id;
		this.status_id = status_id;
		this.partner_service_id = partner_service_id;
		this.date = date;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return String.format("appointment[id=%d, customer_id=%d, employee_id=%d, status_id=%d,partner_service_id=%d, date=%s, start=%s, end=%s",
				id, customer_id, employee_id, status_id, partner_service_id, date, start, end);
}
	
	public Long getId() {
		return id;
	}
	
	public Long getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	
	public Long getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	
	public Long getStatus_id() {
		return status_id;
	}
	
	public void setStatus_id(Long status_id) {
		this.status_id = status_id;
	}
	
	public Long getPartner_service_id() {
		return partner_service_id;
	}
	
	public void setPartner_service_id(Long partner_service_id) {
		this.partner_service_id = partner_service_id;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalTime getStart() {
		return start;
	}
	
	public void setStart(LocalTime start) {
		this.start = start;
	}
	
	public LocalTime getEnd() {
		return end;
	}
	
	public void setEnd(LocalTime end) {
		this.end = end;
	}
}
