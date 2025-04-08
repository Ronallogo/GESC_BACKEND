package gesc.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.math.BigInteger;


@Entity
@Table(name="saving_account")

public class SAVING_ACCOUNT implements Serializable {
    @Id
    private String numSavingAccount ;
    private Float interestRate  ;
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idAccount")
    private ACCOUNT account ;



	public String getNumSavingAccount() {
		return numSavingAccount;
	}

	public void setNumSavingAccount(String numSavingAccount) {
		this.numSavingAccount = numSavingAccount;
	}

	 
	public ACCOUNT getAccount() {
		return account;
	}

	public void setAccount(ACCOUNT account) {
		this.account = account;
	}

	public SAVING_ACCOUNT(String numSavingAccount, Float interestRate, ACCOUNT account) {
		super();
		this.numSavingAccount = numSavingAccount;
		this.interestRate = interestRate;
		this.account = account;
	}
    
	public SAVING_ACCOUNT() {}

	public SAVING_ACCOUNT(Float interestRate) {
		this.interestRate = interestRate ; 
		// TODO Auto-generated constructor stub
	}

	public Float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}


}
