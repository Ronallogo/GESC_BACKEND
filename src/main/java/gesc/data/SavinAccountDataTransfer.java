package gesc.data;

import java.math.BigInteger;
import java.util.Date;

import gesc.entities.CLIENT;

public class SavinAccountDataTransfer extends AccountDataTransfer {
		private Float interestRate ;

		public Float getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(Float interestRate) {
			this.interestRate = interestRate;
		}
 

		public SavinAccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance,
				String status, CLIENT client, String typeAccount) {
			super(idAccount, numAccount, createAt, balance, status, client, typeAccount);
			// TODO Auto-generated constructor stub
		}

		public SavinAccountDataTransfer(Long idAccount, String numAccount, Date createAt, BigInteger balance,
				String status, CLIENT client, String typeAccount, Float interestRate) {
			super(idAccount, numAccount, createAt, balance, status, client, typeAccount);
			this.interestRate = interestRate;
		}

		public SavinAccountDataTransfer() {
			super();
			// TODO Auto-generated constructor stub
		}

		 
		
		
}
