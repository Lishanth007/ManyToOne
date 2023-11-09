package Mapping.pkg;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	private int ownerId;
	private String ownerName;
	@OneToMany
	private List<Companys> CompanyOwnedBy;
	

	public List<Companys> getCompanyOwnedBy() {
		return CompanyOwnedBy;
	}

	public void setCompanyOwnedBy(List<Companys> companyOwnedBy) {
		CompanyOwnedBy = companyOwnedBy;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
