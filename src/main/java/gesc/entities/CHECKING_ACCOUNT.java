package gesc.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.math.BigInteger;
@Entity
@Table(name="checking_account")

public class CHECKING_ACCOUNT implements Serializable {
    @Id
    private String numCheckingAccount  ;
    private  BigInteger overDraft ;
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idAccount")
    private ACCOUNT account ;
    @Override
    public String toString() {
        return "CHECKING_ACCOUNT{" +
                "numCheckingAccount='" + numCheckingAccount + '\'' +
                ",  overDraft=" +  this.overDraft +
                account.toString() +
                '}';
    }
	public String getNumCheckingAccount() {
		return numCheckingAccount;
	}
	public void setNumCheckingAccount(String numCheckingAccount) {
		this.numCheckingAccount = numCheckingAccount;
	}

	public ACCOUNT getAccount() {
		return account;
	}
	public void setAccount(ACCOUNT account) {
		this.account = account;
	}
	public CHECKING_ACCOUNT(String numCheckingAccount,  BigInteger  overDraft, ACCOUNT account) {
		super();
		this.numCheckingAccount = numCheckingAccount;
		this.overDraft =  overDraft;
		this.account = account;
	}
    
	public CHECKING_ACCOUNT() {}
	public CHECKING_ACCOUNT(BigInteger overDraft) {
		//this
		// TODO Auto-generated constructor stub
	}

	public BigInteger getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(BigInteger overDraft) {
		this.overDraft = overDraft;
	}
}
