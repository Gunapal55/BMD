package com.tyss.bmd.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Doctor_info")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doc_id")
	private int doctorId;

	@Column(name = "doc_nm")
	private String doctorName;

	@Column(name = "doc_qual")
	private String doctorQualification;

	@Column(name = "doc_splz")
	private String doctorSpeacilization;

	@Column(name = "pra_fm")
	private String praticefrom;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "doc_id", referencedColumnName = "doc_id")
//	List<Appointment> appointments = new ArrayList<Appointment>();
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "doc_id", referencedColumnName = "doc_id")
//	List<DueDays> dueDays = new ArrayList<DueDays>();
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "doc_id", referencedColumnName = "doc_id")
//	List<TimeSlote> timelots = new ArrayList<TimeSlote>();

	

	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Appointment> appointments;
	
	
	
	
}
