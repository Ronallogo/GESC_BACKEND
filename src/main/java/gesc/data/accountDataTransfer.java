package gesc.data;

import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import gesc.entities.ACCOUNT_STATUS;
import gesc.entities.CLIENT;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
 

public class AccountDataTransfer {
	private Long idAccount ;
    private String numAccount ;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date createAt ;

    private BigInteger balance ;
    
    private  String status ;
    
   private String typeAccount ;

   private BigInteger overDraft ;


	private Float interestRate ;
	 
    private CLIENT client ;

	public AccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance, String status, CLIENT client) {
		super();
		this.idAccount = idAccount;
		this.numAccount = numAccount;
		this.createAt = createAt;
		this.balance = balance;
		this.status = status;
		this.client = client;

	}

	public Long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	public String getNumAccount() {
		return numAccount;
	}
	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public BigInteger getBalance() {
		return balance;
	}
	public void setBalance(BigInteger balance) {
		this.balance = balance;
	}
	public  String getStatus() {
		return status;
	}
	public void setStatus( String  status) {
		this.status = status;
	}
	public CLIENT getClient() {
		return client;
	}
	public void setClient(CLIENT client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "accountDataTransfer [idAccount=" + idAccount + ", numAccount=" + numAccount + ", createAt=" + createAt
				+ ", balance=" + balance + ", status=" + status + this.client.toString() +  "]";
	}
	public AccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance,
			 String status, CLIENT client , String typeAccount) {
		super();
		this.idAccount = idAccount;
		this.numAccount = numAccount;
		this.createAt = createAt;
		this.balance = balance;
		this.status = status;
		this.client = client;
		this.typeAccount = typeAccount ; 
	}
	
	public AccountDataTransfer() {}
	public String getTypeAccount() {
		return typeAccount;
	}
	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}
	public BigInteger getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(BigInteger overDraft) {
		this.overDraft = overDraft;
	}

	public Float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}



}
