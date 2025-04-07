package gesc.data;

import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;



public class AccountDataTransfer2 {
	private Long idAccount ;
    private String numAccount ;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private  Date createAt ;

    private BigInteger balance ;
   
    private  String status ;
    
    private String typeAccount ;
	private BigInteger overDraft;
	private Float interestRate ;
	 
    private Long idClient ;


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
	public  Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt( Date createAt) {
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
	public void setStatus( String status) {
		this.status = status;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	@Override
	public String toString() {
		return "AccountDataTransfer2 [idAccount=" + idAccount + ", numAccount=" + numAccount + ", createAt=" + createAt
				+ ", balance=" + balance + ", status=" + status + ", idClient=" + idClient + "]";
	}
	public AccountDataTransfer2(Long idAccount, String numAccount,  Date createAt, BigInteger balance,
			 String status, Long idClient , String typeAccount , BigInteger overdraft) {
		super();
		this.idAccount = idAccount;
		this.numAccount = numAccount;
		this.createAt = createAt;
		this.balance = balance;
		this.status = status;
		this.idClient = idClient;
		this.typeAccount = typeAccount ;
		this.overDraft = overdraft ;
	}

	public AccountDataTransfer2(Long idAccount, String numAccount,  Date createAt, BigInteger balance,
								String status, Long idClient , String typeAccount , Float interestRate) {
		super();
		this.idAccount = idAccount;
		this.numAccount = numAccount;
		this.createAt = createAt;
		this.balance = balance;
		this.status = status;
		this.idClient = idClient;
		this.typeAccount = typeAccount ;
		this.interestRate  = interestRate ;
	}

	public AccountDataTransfer2(  String numAccount,  Date createAt, BigInteger balance,
								String status, Long idClient , String typeAccount , BigInteger overdraft) {
		super();

		this.numAccount = numAccount;
		this.createAt = createAt;
		this.balance = balance;
		this.status = status;
		this.idClient = idClient;
		this.typeAccount = typeAccount ;
		this.overDraft = overdraft ;
	}

	public AccountDataTransfer2(  String numAccount,  Date createAt, BigInteger balance,
								String status, Long idClient , String typeAccount , Float interestRate) {
		super();

		this.numAccount = numAccount;
		this.createAt = createAt;
		this.balance = balance;
		this.status = status;
		this.idClient = idClient;
		this.typeAccount = typeAccount ;
		this.interestRate  = interestRate ;
	}
	public AccountDataTransfer2() {}
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
