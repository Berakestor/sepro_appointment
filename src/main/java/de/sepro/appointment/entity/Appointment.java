package de.sepro.appointment.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long customerId;
	private Long employeeId;
	private Long statusId;
	private Long partnerServiceId;
	private LocalDate date;
	private LocalTime start;
	private LocalTime end;
	
	public Appointment() {}
	
	public Appointment(Long customerId, Long employeeId, Long statusId, Long partnerServiceId, LocalDate date, LocalTime start, LocalTime end) {
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.statusId = statusId;
		this.partnerServiceId = partnerServiceId;
		this.date = date;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return String.format("appointment[id=%d, customerId=%d, employeeId=%d, statusId=%d,partnerServiceId=%d, date=%s, start=%s, end=%s",
				id, customerId, employeeId, statusId, partnerServiceId, date, start, end);
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	public Long getStatusId() {
		return statusId;
	}
	
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	
	public Long getPartnerServiceId() {
		return partnerServiceId;
	}
	
	public void setPartnerServiceId(Long partnerServiceId) {
		this.partnerServiceId = partnerServiceId;
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
