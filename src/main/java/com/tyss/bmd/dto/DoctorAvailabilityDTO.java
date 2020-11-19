package com.tyss.bmd.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;

import com.tyss.bmd.entity.Doctor;
import com.tyss.bmd.entity.Patient;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class DoctorAvailabilityDTO implements Serializable {

	private int availbilityId;

	private String availableDays;

	private String bookAppointment;

	private int doctorId;

	private int bookAppointmentId;

}
