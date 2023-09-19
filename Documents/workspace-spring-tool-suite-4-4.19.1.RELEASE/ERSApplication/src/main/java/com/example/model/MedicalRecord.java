package com.example.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity   //it will create the data base automatically of the class 
@NoArgsConstructor //(defalt cunstructer)
@AllArgsConstructor //(perrametersised constructor)
@Data //(getter and setters )
public class MedicalRecord {
	
	
	@Id  //medicalID become primary key
	private Long medicalID;
	
	@ManyToOne
	@JoinColumn(name = "patientId")
	private Patient patient;
	private Date recordDate;
	private String treatment;
	private String diagnosis;
	private String testResults;

}
