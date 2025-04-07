package gesc.data;

import gesc.entities.CLIENT;

import java.math.BigInteger;
import java.util.Date;

public class SavingAccountDataTransfer extends AccountDataTransfer {
		private Float interestRate ;

	public SavingAccountDataTransfer(Long idAccount, String numAccount, Date createAt,
									 BigInteger balance, String  status, CLIENT client,
									 Float interestRate) {
		super(idAccount, numAccount, createAt, balance, status, client);
		this.interestRate = interestRate ;
	}

	public Float getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(Float interestRate) {
			this.interestRate = interestRate;
		}
 

		public SavingAccountDataTransfer() {
			super();
			// TODO Auto-generated constructor stub
		}

		 
		
		
}
