package com.bank.db.model.verification;

import javax.persistence.Embeddable;

@Embeddable
public class VerificationVO {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reson == null) ? 0 : reson.hashCode());
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
		VerificationVO other = (VerificationVO) obj;
		if (reson == null) {
			if (other.reson != null)
				return false;
		} else if (!reson.equals(other.reson))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	private String status;
	private String reson;
	@Override
	public String toString() {
		return "VerificationVO [status=" + status + ", reson=" + reson + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReson() {
		return reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}
}
