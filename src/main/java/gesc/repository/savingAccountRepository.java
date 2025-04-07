package gesc.repository;

import gesc.entities.SAVING_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;

public interface savingAccountRepository extends JpaRepository<SAVING_ACCOUNT , String> {

    @Query(value = "SELECT interestRate FROM saving_account WHERE num_saving_account= : num" , nativeQuery = true)
     Float takeInterestRate(@Param("num") String num) ;
}
