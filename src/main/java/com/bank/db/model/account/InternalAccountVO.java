package com.bank.db.model.account;

import javax.persistence.Embeddable;

@Embeddable
public class InternalAccountVO {

	AccountBankBasicVO accountBankBasicVO;

	public AccountBankBasicVO getAccountBankBasicVO() {
		return accountBankBasicVO;
	}

	public void setAccountBankBasicVO(AccountBankBasicVO accountBankBasicVO) {
		this.accountBankBasicVO = accountBankBasicVO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountBankBasicVO == null) ? 0 : accountBankBasicVO.hashCode());
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
		InternalAccountVO other = (InternalAccountVO) obj;
		if (accountBankBasicVO == null) {
			if (other.accountBankBasicVO != null)
				return false;
		} else if (!accountBankBasicVO.equals(other.accountBankBasicVO))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InternalAccountVO [accountBankBasicVO=" + accountBankBasicVO + "]";
	}
}
