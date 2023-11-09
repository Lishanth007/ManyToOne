package Mapping.pkg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {
	@Id
	private int ownerId;
	private String ownerName;

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
