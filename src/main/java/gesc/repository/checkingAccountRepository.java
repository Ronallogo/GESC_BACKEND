package gesc.repository;

import gesc.entities.CHECKING_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface checkingAccountRepository extends JpaRepository<CHECKING_ACCOUNT, String> {
}
