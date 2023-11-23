package com.pes.bankmanager.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class AuditTrail {
    @Id
    private String event_id;
    private String event;
    @CreationTimestamp
    private LocalDateTime time_of_event;
    @ManyToOne
    @JoinColumn(name="event_account", referencedColumnName = "account_number")
    private Accounts event_number;
}
