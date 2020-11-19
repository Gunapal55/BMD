package com.tyss.bmd.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "ratings")
@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rat_id")
	private int ratingId;

//	@NotNull
	@Column(name = "pat_id")
	private String patientId;

	@Column(name = "doc_id")
	private int doctorId;

//	@Pattern(regexp = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{6,15})$")
	@Column(name = "doc_name")
	private String doctorName;

	@Column(name = "feedback")
	private String feedback;

//	@NotNull
	@Column(name = "rating")
	private int rating;

	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="patientId")
	private Patient patient;

}
