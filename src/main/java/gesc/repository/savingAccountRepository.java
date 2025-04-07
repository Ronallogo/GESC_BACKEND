package gesc.repository;

import gesc.entities.SAVING_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface savingAccountRepository extends JpaRepository<SAVING_ACCOUNT , String> {
}
