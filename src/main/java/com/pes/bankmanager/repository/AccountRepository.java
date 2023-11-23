package com.pes.bankmanager.repository;

import com.pes.bankmanager.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts, String> {

}
