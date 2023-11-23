package com.pes.bankmanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
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
