package com.pes.bankmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bank_id;
    private String ifsc_number;
    private String bank_address;
}
