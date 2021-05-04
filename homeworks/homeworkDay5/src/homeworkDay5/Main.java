package homeworkDay5;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new AbcShopCustomerManager(new MernisServiceAdapter());
		
		// Müşteri oluşturuldu
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Orhan");
		customer.setLastName("ARI");
		customer.setNationalityId("11111111111");
		customer.setYearOfBirth("1900");
		
		customerManager.registerCustomer(customer);
		
		// Oyun ürünleri oluşturuldu
		Product gameProduct = new Product();
		gameProduct.setId(1);
		gameProduct.setGameName("GTA V");
		gameProduct.setGamePrice(89.90);
		gameProduct.setGameDiscount(0);
		
		CustomerTrade customerTrade = new CustomerTrade();
		customerTrade.sellProduct(customer, gameProduct);
		
		// Kampanya simule ediliyor
		BaseCampaignManager campaignManager = new AbcShopCampaignManager();
		campaignManager.newCampaign(gameProduct, 10);
		
		customerTrade.sellProduct(customer, gameProduct);
		
		campaignManager.deleteCampaign(gameProduct);
		customerTrade.sellProduct(customer, gameProduct);
		
	}

}
