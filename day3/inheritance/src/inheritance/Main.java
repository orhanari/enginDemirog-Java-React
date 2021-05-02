package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78945";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		/* Java, buradaki deðerleri gönderirken Individual mý, Corporate mi ayrýmýný yapabilir
		 * Kod deðiþtirilmeden CustomerManager içerisindeki blok çalýþýyor. */
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);*/
		
		Customer[] customers = {engin, hepsiBurada, abc};
		
		customerManager.addMultiple(customers);
	}

}
