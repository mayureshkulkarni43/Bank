package com.bank.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bank.db.model.account.AccountVO;
import com.bank.db.model.verification.VerificationVO;

@Entity

public class CustomerVO {
	
	

	
	

	BaseJO baseJO;
	
	@Id
	AccountVO accountVO;
	
	VerificationVO verifiactionVo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountVO == null) ? 0 : accountVO.hashCode());
		result = prime * result + ((baseJO == null) ? 0 : baseJO.hashCode());
		result = prime * result + ((verifiactionVo == null) ? 0 : verifiactionVo.hashCode());
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
		CustomerVO other = (CustomerVO) obj;
		if (accountVO == null) {
			if (other.accountVO != null)
				return false;
		} else if (!accountVO.equals(other.accountVO))
			return false;
		if (baseJO == null) {
			if (other.baseJO != null)
				return false;
		} else if (!baseJO.equals(other.baseJO))
			return false;
		if (verifiactionVo == null) {
			if (other.verifiactionVo != null)
				return false;
		} else if (!verifiactionVo.equals(other.verifiactionVo))
			return false;
		return true;
	}
	public BaseJO getBaseJO() {
		return baseJO;
	}
	public void setBaseJO(BaseJO baseJO) {
		this.baseJO = baseJO;
	}
	public AccountVO getAccountVO() {
		return accountVO;
	}
	public void setAccountVO(AccountVO accountVO) {
		this.accountVO = accountVO;
	}
	public VerificationVO getVerifiactionVo() {
		return verifiactionVo;
	}
	public void setVerifiactionVo(VerificationVO verifiactionVo) {
		this.verifiactionVo = verifiactionVo;
	}
	@Override
	public String toString() {
		return "CustomerVO [baseJO=" + baseJO + ", accountVO=" + accountVO + ", verifiactionVo=" + verifiactionVo + "]";
	}

}
