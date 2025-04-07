package gesc.repository;

import gesc.entities.CHECKING_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;
@Repository
public interface checkingAccountRepository extends JpaRepository<CHECKING_ACCOUNT, String> {

    @Query(value = "SELECT overDraft FROM checking_account WHERE num_checking_account= : num" , nativeQuery = true)
    BigInteger takeOverDraft(@Param("num") String num) ;

}
