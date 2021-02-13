package com.bank.db.model.account;

import static org.assertj.core.api.Assertions.extractProperty;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;

import org.hibernate.annotations.ColumnDefault;

@Embeddable
public class ExternalAccountVO {

	@ElementCollection
		List<AccountBankBasicVO> accounts;

	public List<AccountBankBasicVO> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountBankBasicVO> accounts) {
		this.accounts = accounts;
	}

	//@ElementCollection  
	


	@Override
	public String toString() {
		return "ExternalAccountVO [accounts=" + accounts + "]";
	}
}