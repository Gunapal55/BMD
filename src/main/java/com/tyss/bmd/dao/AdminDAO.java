package com.tyss.bmd.dao;

import java.util.List;

import com.tyss.bmd.entity.Appointment;
import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;


public interface AdminDAO {

	public Doctor addDoctor(Doctor doctor);

	public List<Appointment> viewAllAppointments(Appointment appointment);

	public Doctor updateDoctor(Doctor doctor);

	public Patient updatePatient(Patient patient);

	public List<Doctor> getAllDoctor();

	public List<Patient> getAllPatient();

	public Appointment removeAppointment(int appointmentId);

	public Patient removePatient(int patientId);

	public Doctor removeDoctor(int id);

}
