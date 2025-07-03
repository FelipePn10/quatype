package com.service.patient.controller;

import com.service.patient.dto.response.PatientResponseDTO;
import com.service.patient.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/patients")
public class PatientController {
    Logger logger = LoggerFactory.getLogger(PatientController.class);
    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
        logger.info("getAllPatients");
        List<PatientResponseDTO> list = patientService.getAllPatients();
        logger.info("getAllPatients: list={}", list);
        return ResponseEntity.ok().body(list);
    }
}