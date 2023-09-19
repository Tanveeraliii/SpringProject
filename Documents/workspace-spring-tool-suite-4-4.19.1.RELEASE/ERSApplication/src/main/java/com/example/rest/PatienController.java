package com.example.rest;

import com.example.model.CalculatedResponse;
import com.example.model.NumberRequest;
import com.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Patient;

@RestController
@RequestMapping(value = "/api")
public class PatienController {
    @Autowired
    private PatientService patientService;
    @PostMapping(value = "/patient")
    public ResponseEntity<Integer> registerPatient(@RequestBody Patient patient) {

        return ResponseEntity.ok(patientService.getNumberOfPatients());
    }


	@GetMapping(value = "/myPage")
	public String mypage(){


		return "Hello my name is Tanveer";
	}








}