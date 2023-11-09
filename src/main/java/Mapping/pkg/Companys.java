// Company.java
package Mapping.pkg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Companys {
	@Id
	private int companyId;
	private String companyName;
	
	@ManyToOne
	private Owner companyOwner;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Owner getCompanyOwner() {
		return companyOwner;
	}

	public void setCompanyOwner(Owner companyOwner) {
		this.companyOwner = companyOwner;
	}
}
