package gesc.repository;

import gesc.entities.OPERATION;
import org.springframework.data.jpa.repository.JpaRepository;

public interface operationRepository extends JpaRepository<OPERATION, Long> {
}
