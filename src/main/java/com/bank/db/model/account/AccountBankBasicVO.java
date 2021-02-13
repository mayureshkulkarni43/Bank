package com.bank.db.model.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.lang.NonNull;

@Embeddable
public class AccountBankBasicVO {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=11,unique=true)
	
	private int accountNo;
	
	@Column(length=8)

	private String ifscCode;
	
	private String branchName;
	
	
	private String accountType;
	
	private double balence;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_on")
	private Date openDate;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNo;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balence);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((ifscCode == null) ? 0 : ifscCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountBankBasicVO other = (AccountBankBasicVO) obj;
		if (accountNo != other.accountNo)
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (Double.doubleToLongBits(balence) != Double.doubleToLongBits(other.balence))
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (ifscCode == null) {
			if (other.ifscCode != null)
				return false;
		} else if (!ifscCode.equals(other.ifscCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountBankBasicVO [accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", branchName=" + branchName
				+ ", accountType=" + accountType + ", balence=" + balence + ", openDate=" + openDate + "]";
	}
}
