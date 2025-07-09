package com.service.patient.controller;

import com.service.patient.dto.request.PatientRequestDTO;
import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.dto.validators.CreatePatientValidationGroup;
import com.service.patient.service.PatientService;
import jakarta.validation.Valid;
import jakarta.validation.groups.Default;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/patients")
public class PatientController {
    Logger logger = LoggerFactory.getLogger(PatientController.class);
    private final PatientService patientService;

    @GetMapping("/search/patients")
    public ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
        logger.info("getAllPatients");
        List<PatientResponseDTO> list = patientService.getAllPatients();
        logger.info("getAllPatients: list={}", list);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/create/patient")
    public ResponseEntity<PatientResponseDTO> createPatient(
            @Validated({Default.class, CreatePatientValidationGroup.class})
            @RequestBody PatientRequestDTO patientRequestDTO) {
        logger.info("createPatient: patientRequestDTO={}", patientRequestDTO);
        PatientResponseDTO patientResponseDTO = patientService.createPatient(patientRequestDTO);
        logger.info("createPatient: patientResponseDTO={}", patientResponseDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
    }

    @PutMapping("/update/{id}/patient")
    public ResponseEntity<PatientResponseDTO> updatePatient(
            @PathVariable UUID id,
            @Validated({Default.class}) @RequestBody PatientRequestDTO patientRequestDTO) {
        logger.info("updatePatient: patientRequestDTO={}", patientRequestDTO);
        PatientResponseDTO patientResponseDTO = patientService.updatePatient(id, patientRequestDTO);
        logger.info("updatePatient: patientResponseDTO={}", patientResponseDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
    }

    @DeleteMapping("/delete/{id}/patient")
    public ResponseEntity<Void> deletePatient(
            @PathVariable UUID id) {
        logger.info("deletePatient: id={}", id);
        patientService.deletePatient(id);
        logger.info("deletePatient: id={}", id);
        return ResponseEntity.noContent().build();
    }
}