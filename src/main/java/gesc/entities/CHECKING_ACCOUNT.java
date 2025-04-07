package gesc.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.math.BigInteger;
@Entity
@Table(name="checking_account")

public class CHECKING_ACCOUNT implements Serializable {
    @Id
    private String numCheckingAccount  ;
    private Float interestRate ;
    @OneToOne(cascade = CascadeType.ALL)
    private ACCOUNT account ;
    @Override
    public String toString() {
        return "CHECKING_ACCOUNT{" +
                "numCheckingAccount='" + numCheckingAccount + '\'' +
                ", interestRate=" + interestRate +
                account.toString() +
                '}';
    }
	public String getNumCheckingAccount() {
		return numCheckingAccount;
	}
	public void setNumCheckingAccount(String numCheckingAccount) {
		this.numCheckingAccount = numCheckingAccount;
	}
	public Float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	public ACCOUNT getAccount() {
		return account;
	}
	public void setAccount(ACCOUNT account) {
		this.account = account;
	}
	public CHECKING_ACCOUNT(String numCheckingAccount, Float interestRate, ACCOUNT account) {
		super();
		this.numCheckingAccount = numCheckingAccount;
		this.interestRate = interestRate;
		this.account = account;
	}
    
	public CHECKING_ACCOUNT() {}
	public CHECKING_ACCOUNT(BigInteger overDraft) {
		//this
		// TODO Auto-generated constructor stub
	}
}
