package gesc.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name="account")

public class ACCOUNT implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idAccount ;
    private String numAccount ;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date createAt ;

    private BigInteger balance ;
    @Enumerated(EnumType.STRING)
    private ACCOUNT_STATUS status ;
    @ManyToOne
    private CLIENT client ;

    public ACCOUNT(Long idAccount, String numAccount, Date createAt, BigInteger balance, ACCOUNT_STATUS status, CLIENT client) {
        this.idAccount = idAccount;
        this.numAccount = numAccount;
        this.createAt = createAt;
        this.balance = balance;
        this.status = status;
        this.client = client;
    }

	public ACCOUNT(Long idAccount, String numAccount, BigInteger balance, Date createAt, ACCOUNT_STATUS  status,
			CLIENT client) {
		
		 	this.idAccount = idAccount;
	        this.numAccount = numAccount;
	        this.createAt = createAt;
	        this.balance = balance;
	        this.status =   status;
	        this.client = client;
	}
	public ACCOUNT() {
		// TODO Auto-generated constructor stub
	}

    public ACCOUNT(String s, Date createAt, BigInteger balance, ACCOUNT_STATUS accountStatus, CLIENT client) {

        this.numAccount = s;
        this.createAt = createAt;
        this.balance = balance;
        this.status = accountStatus;
        this.client = client;
    }


    @Override
    public String toString() {
        return "ACCOUNT{" +
                "idAccount=" + idAccount +
                ", numAccount='" + numAccount + '\'' +
                ", createAt=" + createAt +
                ", balance=" + balance +
                ", status=" + status.name()+
                '}';
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

    public ACCOUNT_STATUS getStatus() {
        return status;
    }

    public void setStatus(ACCOUNT_STATUS status) {
        this.status = status;
    }

    public CLIENT getClient() {
        return client;
    }

    public void setClient(CLIENT client) {
        this.client = client;
    }
}
