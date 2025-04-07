package gesc.repository;

import gesc.entities.ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface accountRepository extends JpaRepository<ACCOUNT , Long> {
}
