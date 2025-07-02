package com.service.patient.service;

import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
    private final PatientResponseDTO patientResponseDTO;


}
