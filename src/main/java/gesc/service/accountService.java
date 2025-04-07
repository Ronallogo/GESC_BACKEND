package gesc.service;

import java.util.Objects;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gesc.data.AccountDataTransfer;
import gesc.data.AccountDataTransfer2;
import gesc.entities.ACCOUNT;
import gesc.entities.ACCOUNT_STATUS;
import gesc.entities.CHECKING_ACCOUNT;
import gesc.entities.CLIENT;
import gesc.entities.SAVING_ACCOUNT;
import gesc.repository.accountRepository;
import gesc.repository.checkingAccountRepository;
import gesc.repository.clientRepository;
import gesc.repository.savingAccountRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class accountService {
	@Autowired
	private accountRepository ar;
	@Autowired
	private clientRepository cr;
	@Autowired
	private checkingAccountRepository car;
	@Autowired
	private savingAccountRepository sar;

	public String create(AccountDataTransfer2 a) {

		if (!this.ar.existsById(a.getIdAccount())) return "CLIENT DON'T EXIST";
		var client = this.cr.findById(a.getIdClient());
		var account = this.ar.save(new ACCOUNT(generateNumAccount() , a.getCreateAt(), a.getBalance(), ACCOUNT_STATUS.CREATED , client.get() ));

		if (Objects.equals(a.getTypeAccount(), "CHECKING_ACCOUNT")) {

			this.car.save(new CHECKING_ACCOUNT( a.getOverDraft()));

		} else {
			this.sar.save(new SAVING_ACCOUNT(a.getInterestRate()));
		}

		return account.toString();
	}


	public String generateNumAccount(){
			return "000"+ new Random().nextInt(10000);
	}







	
	
	 
	
	 
}
