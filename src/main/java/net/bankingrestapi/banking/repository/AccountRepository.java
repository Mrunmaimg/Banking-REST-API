package net.bankingrestapi.banking.repository;

import net.bankingrestapi.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
