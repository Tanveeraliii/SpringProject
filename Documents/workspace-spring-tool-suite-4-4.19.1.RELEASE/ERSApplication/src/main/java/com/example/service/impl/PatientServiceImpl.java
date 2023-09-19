package com.example.service.impl;

import com.example.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService    {

    @Override
    public int getNumberOfPatients() {
        return 1000;
    }
}
