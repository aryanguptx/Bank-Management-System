package com.pes.bankmanager.entities;

import jakarta.persistence.*;

@Entity
public class PaymentInstruments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instrumentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_number", referencedColumnName = "account_number")
    private Accounts account;

    private String instrumentType;

    private String instrumentNumber;

    private String expiryDate;

}
