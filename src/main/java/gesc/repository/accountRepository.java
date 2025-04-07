package gesc.repository;

import gesc.entities.ACCOUNT;
import gesc.entities.CHECKING_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface accountRepository extends JpaRepository<ACCOUNT , Long> {


    @Query(value = "SELECT * FROM account WHERE num_account= :num" , nativeQuery = true)
    Optional<ACCOUNT> searchAccount(@Param("num") String num) ;
}
