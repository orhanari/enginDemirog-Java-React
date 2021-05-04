package homeworkDay5;

public class AbcShopCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	
	public AbcShopCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void registerCustomer(Customer customer) {
		// Customer Doğrula
		if(customerCheckService.checkIfRealPerson(customer)) {
			customer.setStatus(true);
			super.registerCustomer(customer);
		}
		else {
			customer.setStatus(false);
			System.out.println("Doğrulama başarısız!");
		}
	}

	@Override
	public void updateCustomer(Customer customer) {
		super.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		super.deleteCustomer(customer);
	}

}
