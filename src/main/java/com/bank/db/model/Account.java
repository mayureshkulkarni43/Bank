package com.bank.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="accounts")
public class Account {
	@Id
	 private Integer regno;
	
	private int uid;
	
	private Integer accountno;
	
	private String reason;
	
private String status;
	
	 @Override
public String toString() {
	return "Account [regno=" + regno + ", uid=" + uid + ", accountno=" + accountno + ", reason=" + reason + ", status="
			+ status + ", customerFirstName=" + customerFirstName + ", customerMiddleName=" + customerMiddleName
			+ ", customerLastName=" + customerLastName + ", gender=" + gender + ", email=" + email + ", dateOfBirth="
			+ dateOfBirth + "]";
}
	public Integer getRegno() {
	return regno;
}
public void setRegno(Integer regno) {
	this.regno = regno;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public Integer getAccountno() {
	return accountno;
}
public void setAccountno(Integer accountno) {
	this.accountno = accountno;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
	@Column(name="firstname")
	private String customerFirstName;
	 @Column(name="middlename")
	private String customerMiddleName;
	
	 @Column(name="lastname")
	 private String customerLastName;
	 
	 @Column(name="gender")
	private String gender;
	
	 @Column(name="email")
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dob")
	private Date dateOfBirth;
	
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerMiddleName() {
		return customerMiddleName;
	}
	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountno;
		result = prime * result + ((customerFirstName == null) ? 0 : customerFirstName.hashCode());
		result = prime * result + ((customerLastName == null) ? 0 : customerLastName.hashCode());
		result = prime * result + ((customerMiddleName == null) ? 0 : customerMiddleName.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + ((regno == null) ? 0 : regno.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		
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
		Account other = (Account) obj;
		if (accountno != other.accountno)
			return false;
		if (customerFirstName == null) {
			if (other.customerFirstName != null)
				return false;
		} else if (!customerFirstName.equals(other.customerFirstName))
			return false;
		if (customerLastName == null) {
			if (other.customerLastName != null)
				return false;
		} else if (!customerLastName.equals(other.customerLastName))
			return false;
		if (customerMiddleName == null) {
			if (other.customerMiddleName != null)
				return false;
		} else if (!customerMiddleName.equals(other.customerMiddleName))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (regno == null) {
			if (other.regno != null)
				return false;
		} else if (!regno.equals(other.regno))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		
		return true;
	}
	
	
	
}
