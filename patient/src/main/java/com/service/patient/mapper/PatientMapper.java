package com.service.patient.mapper;

import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.model.PatientModel;

public class PatientMapper {
    public static PatientResponseDTO toDTO(PatientModel patientModel) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        return patientResponseDTO;
    }
}
