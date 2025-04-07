package gesc.data;

import java.math.BigInteger;
import java.util.Date;

import gesc.entities.CLIENT;

public class CheckingAccountDataTransfer extends AccountDataTransfer {
	private BigInteger overDraft ;

	public CheckingAccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance, String  status, CLIENT client, BigInteger overDraft) {
		super(idAccount, numAccount, createAt, balance, status, client);
		this.overDraft = overDraft;
	}

	public BigInteger getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(BigInteger overDraft) {
		this.overDraft = overDraft;
	}

	public CheckingAccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance,
			String status, CLIENT client, String typeAccount, BigInteger overDraft) {
		super(idAccount, numAccount, createAt, balance, status, client, typeAccount);
		this.overDraft = overDraft;
	}

	public CheckingAccountDataTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckingAccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance,
			String status, CLIENT client, String typeAccount) {
		super(idAccount, numAccount, createAt, balance, status, client, typeAccount);
		// TODO Auto-generated constructor stub
	} 
	

}
