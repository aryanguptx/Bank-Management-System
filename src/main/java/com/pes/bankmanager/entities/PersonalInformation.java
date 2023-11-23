package com.pes.bankmanager.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personal_information")
@NoArgsConstructor
public class PersonalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pan_number", unique = true, nullable = false)
    private String panNumber;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "address")
    private String address;

}

