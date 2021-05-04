package homeworkDay5;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void registerCustomer(Customer customer) {
		System.out.println("Kayıt başarılı: " + customer.getFirstName());
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Kayıt güncelleme başarılı: " + customer.getFirstName());
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println("Kayıt silme başarılı: " + customer.getFirstName());
	}
	
}
