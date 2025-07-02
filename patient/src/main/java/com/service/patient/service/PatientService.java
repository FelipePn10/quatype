package com.service.patient.service;

import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.mapper.PatientMapper;
import com.service.patient.model.PatientModel;
import com.service.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getAllPatients() {
        List<PatientModel> patientModels = patientRepository.findAll();

        List<PatientResponseDTO> patientResponseDTOs = patientModels.stream()
                        .map(PatientMapper::toDTO)
                        .toList();
    }
}
