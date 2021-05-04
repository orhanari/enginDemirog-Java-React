package homeworkDay4;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Orhan");
		customer.setLastName("ARI");
		customer.setYearOfBirth("1900");
		customer.setNationalityId("11111111111");
		customerManager.save(customer);
		
	}

}
