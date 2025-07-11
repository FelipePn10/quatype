package com.service.patient.mapper;

import com.service.patient.dto.request.PatientRequestDTO;
import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.model.PatientModel;

import java.time.LocalDate;

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

    public static PatientModel toModel(PatientRequestDTO patientRequestDTO) {
        PatientModel patientModel = new PatientModel();
        patientModel.setName(patientRequestDTO.getName());
        patientModel.setAddress(patientRequestDTO.getAddress());
        patientModel.setEmail(patientRequestDTO.getEmail());
        patientModel.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patientModel.setRegistrationDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()).atStartOfDay());
        return patientModel;
    }
}
