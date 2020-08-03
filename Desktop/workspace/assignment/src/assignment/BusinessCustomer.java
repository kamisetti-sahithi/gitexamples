package assignment;

public class BusinessCustomer extends Customer {
	private String businessAddress;

	public BusinessCustomer(String id, String name, String businessAddress,Account account) {
		super(id, name,account);
		this.businessAddress = businessAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

}
