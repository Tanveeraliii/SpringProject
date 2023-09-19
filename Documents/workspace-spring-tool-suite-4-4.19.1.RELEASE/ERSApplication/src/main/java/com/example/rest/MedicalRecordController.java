package com.example.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MedicalRecord;

@RestController
@RequestMapping (value = "/medical")
public class MedicalRecordController {
	
	@PostMapping(value = "/patients")
	public ResponseEntity<MedicalRecord> createMedicalRecord(
			@RequestBody MedicalRecord medicalRecord
			) {
		System.out.println("This is medical data "+ medicalRecord);
		return ResponseEntity.ok(medicalRecord);
	}

}
