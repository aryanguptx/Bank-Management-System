package com.pes.bankmanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Accounts {
    @Id
    @Column(unique = true)
    private String account_number;

    private String pan_number;
    private String balance;
    private String isfc_number;
    private LocalDateTime data_created;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "pan_number", unique = true)
    private PersonalInformation personalInformation;

}