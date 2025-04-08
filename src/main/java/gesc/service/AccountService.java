package gesc.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

import gesc.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class AccountService {
	@Autowired
	private accountRepository ar;
	@Autowired
	private clientRepository cr;
	@Autowired
	private checkingAccountRepository car;
	@Autowired
	private savingAccountRepository sar;

	public String create(AccountDataTransfer2 a) {

		if (!this.cr.existsById(a.getIdClient())) return "CLIENT DON'T EXIST";
		var client = this.cr.findById(a.getIdClient());

		System.out.println( a.getCreateAt().toString());

		var account = this.ar.save(new ACCOUNT(generateNumAccount() ,  a.getCreateAt() , a.getBalance(), ACCOUNT_STATUS.CREATED , client.get() ));

		if (Objects.equals(a.getTypeAccount(), "CHECKING_ACCOUNT")) {
			this.car.save(new CHECKING_ACCOUNT(account.getNumAccount() , a.getOverDraft() , account));
		} else {
			this.sar.save(new SAVING_ACCOUNT(account.getNumAccount() , a.getInterestRate() , account));
		}

		return account.toString();
	}

	public String generateNumAccount(){
			return "000"+ new Random().nextInt(10000);
	}

	public AccountDataTransfer searchAccount(String numAccount , String typeAccount){
		var account = this.ar.searchAccount(numAccount).get();
		var accountDataTransfer =  new AccountDataTransfer(
				account.getIdAccount(),
				account.getNumAccount() ,
				account.getCreateAt() ,
				account.getBalance() ,
				account.getStatus().name() ,
				account.getClient()
		);

		if(Objects.equals(typeAccount , "CHECKING_ACCOUNT")){
			BigInteger overDraft = this.car.takeOverDraft(numAccount);
			accountDataTransfer.setTypeAccount("CHECKING_ACCOUNT");
			accountDataTransfer.setOverDraft(overDraft);

        }
		else{
			Float  interestRate = this.sar.takeInterestRate(numAccount);
			accountDataTransfer.setTypeAccount("SAVING_ACCOUNT");
			accountDataTransfer.setInterestRate(interestRate) ;

        }
        return accountDataTransfer ;

    }

	public List<CheckingAccountDataTransfer> allCheckingAccount(){
			return this.car.findAll().stream().map(x->
					new CheckingAccountDataTransfer(
							x.getAccount().getIdAccount(),
							x.getAccount().getNumAccount() ,
							x.getAccount().getCreateAt(),
							x.getAccount().getBalance() ,
							x.getAccount().getStatus().name() ,
							x.getAccount().getClient() ,
							x.getOverDraft()
					)

					).collect(Collectors.toList());
	}

	public List<SavingAccountDataTransfer> allSavingAccount(){
		return this.sar.findAll().stream().map(x->
				new SavingAccountDataTransfer(
						x.getAccount().getIdAccount(),
						x.getAccount().getNumAccount() ,
						x.getAccount().getCreateAt(),
						x.getAccount().getBalance() ,
						x.getAccount().getStatus().name() ,
						x.getAccount().getClient() ,
						x.getInterestRate()
				)

		).collect(Collectors.toList());
	}

	public String changeStatus(String numAccount){
		var account = this.ar.searchAccount(numAccount) ;
		if(account.isEmpty()) return "NOT ACCOUNT" ;

		if(Objects.equals(account.get().getStatus().name() , "CREATED")
			|| Objects.equals(account.get().getStatus().name() , "ACTIVATED")){
				account.get().setStatus(ACCOUNT_STATUS.SUSPENDED);
				this.ar.save(account.get());

		}else{
			account.get().setStatus(ACCOUNT_STATUS.ACTIVATED);
			this.ar.save(account.get());
		}
		return "STATUS_CHANGED" ;

	}






	
	
	 
	
	 
}
