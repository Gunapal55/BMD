package com.tyss.bmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
@Table(name = "patient_info")
@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pat_id")
	private int patientId;

	@Column(name = "pat_nm")
	private String patientName;

	@Column(name = "pat_age")
	private int patinetAge;

	@Column(name = "gender")
	private String gender;

//	@Pattern(regexp = "	\r\n" + "^[2-9]\\d{2}-\\d{3}-\\d{4}$")
	@Column(name = "pat_ph")
	private int patinetPhoneNumber;

	@Email
	@Column(name = "pat_email")
	private String patinetEmailId;

	@Column(name = "pat_place")
	private String patinetPlace;

	@OneToOne(mappedBy = "patient")
	private Rating ratingdetails;

//	@Column(name = "ba_id")
//	private int bookAppointmentId;
//
//	@Column(name = "rat_id")
//	private int ratingId;

}
