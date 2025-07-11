package com.service.patient.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id")
@Table(name = "patients")
public class PatientModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Setter(AccessLevel.NONE)
    private UUID id = UUID.randomUUID();

    @Size(min = 3, max = 50)
    @Column(nullable = false)
    private String name;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @Size(max = 255)
    @Column(nullable = false)
    private String address;

    @Past
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @PrePersist
    private void onCreate() {
        registrationDate = LocalDateTime.now();
    }
}