package com.service.patient.service;

import com.service.patient.dto.request.PatientRequestDTO;
import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.exception.EmailAlreadyExistsExecption;
import com.service.patient.exception.PatientNotFoundExecption;
import com.service.patient.mapper.PatientMapper;
import com.service.patient.model.PatientModel;
import com.service.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getAllPatients() {
        List<PatientModel> patientModels = patientRepository.findAll();

        return patientModels.stream()
                        .map(PatientMapper::toDTO)
                        .toList();
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        if (patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsExecption("This Email " + "already exists " +
                    patientRequestDTO.getEmail());
        }

        PatientModel patientModel = patientRepository.save(
                PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDTO(patientModel);
    }

    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO) {
        PatientModel patientModel = patientRepository.findById(id).orElseThrow(
                () -> new PatientNotFoundExecption("Patient not found with ID: " + id));
        if (patientRepository.existsByEmailAndIdNot(patientRequestDTO.getEmail(), id)) {
            throw new EmailAlreadyExistsExecption("This Email " + "already exists " +
                    patientRequestDTO.getEmail());
        }

        patientModel.setName(patientRequestDTO.getName());
        patientModel.setAddress(patientRequestDTO.getAddress());
        patientModel.setEmail(patientRequestDTO.getEmail());
        patientModel.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));

        PatientModel updatePatient =  patientRepository.save(patientModel);
        return PatientMapper.toDTO(updatePatient);
    }
}
