package com.service.patient.mapper;

import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.model.PatientModel;

public class PatientMapper {
    public static PatientResponseDTO toDTO(PatientModel patientModel) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patientModel.getId().toString());
        patientResponseDTO.setName(patientModel.getName());
        patientResponseDTO.setAddress(patientModel.getAddress());
        patientResponseDTO.setEmail(patientModel.getEmail());
        patientResponseDTO.setDateOfBirth(patientModel.getDateOfBirth().toString());
        return patientResponseDTO;
    }
}
