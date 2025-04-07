package gesc.repository;

import gesc.entities.CLIENT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<CLIENT, Long> {
}
