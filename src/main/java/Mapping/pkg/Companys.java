// Company.java
package Mapping.pkg;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Companys {
	@Id
	private int companyId;
	private String companyName;

	@ManyToOne(cascade=CascadeType.ALL)
    private Owner owners;

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

	public Owner getOwners() {
		return owners;
	}

	public void setOwners(Owner owners) {
		this.owners = owners;
	}

}
