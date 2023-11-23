package com.pes.bankmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Accounts {
    @Id
    private String account_number;
    private String pan_number;
    private String balance;
    private String isfc_number;
    private LocalDateTime data_created;

}