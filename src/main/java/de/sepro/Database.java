package de.sepro;

import de.sepro.termin.Appointment;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<Appointment> dblist;
	private List<Appointment> removeedAppointmentList;
	private List<Appointment> oldAppointmentList;
	
	public Database() {
		this.dblist = new ArrayList<>();
	}
	
	public void addToDatabase(Appointment appointment) {
		dblist.add(appointment);
	}
	
	public void removeFromDatabase(Appointment appointment) {
		dblist.remove(appointment);
	}
	
	public List<Appointment> getDblist() {
		return dblist;
	}
	
	public Appointment getAppointmentFromID(long id) {
		Appointment appointment = null;
		for (Appointment t : dblist) {
			Long id1 = t.getId();
			if(id1 == id) {
				appointment = t;
			}
		}
		return appointment;
	}
}
