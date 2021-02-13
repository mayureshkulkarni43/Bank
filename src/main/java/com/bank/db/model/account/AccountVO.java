package com.bank.db.model.account;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountVO implements Serializable  {
	
	private InternalAccountVO internalAccountVO;
	
	
	private ExternalAccountVO externalAccountVO;
	public InternalAccountVO getInternalAccountVO() {
		return internalAccountVO;
	}
	public void setInternalAccountVO(InternalAccountVO internalAccountVO) {
		this.internalAccountVO = internalAccountVO;
	}
	public ExternalAccountVO getExternalAccountVO() {
		return externalAccountVO;
	}
	public void setExternalAccountVO(ExternalAccountVO externalAccountVO) {
		this.externalAccountVO = externalAccountVO;
	}
	@Override
	public String toString() {
		return "AccountVO [internalAccountVO=" + internalAccountVO + ", externalAccountVO=" + externalAccountVO + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((externalAccountVO == null) ? 0 : externalAccountVO.hashCode());
		result = prime * result + ((internalAccountVO == null) ? 0 : internalAccountVO.hashCode());
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
		AccountVO other = (AccountVO) obj;
		if (externalAccountVO == null) {
			if (other.externalAccountVO != null)
				return false;
		} else if (!externalAccountVO.equals(other.externalAccountVO))
			return false;
		if (internalAccountVO == null) {
			if (other.internalAccountVO != null)
				return false;
		} else if (!internalAccountVO.equals(other.internalAccountVO))
			return false;
		return true;
	}

}
