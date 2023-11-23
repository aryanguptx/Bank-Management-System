package com.pes.bankmanager.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transaction_id;
    private Float transaction_amount;
    private LocalDateTime transaction_time;
    private String  destination_account_number;
    private String transaction_method;

    @ManyToOne
    @JoinColumn(name="source_account", referencedColumnName = "account_number")
    private Accounts source_account;

}
