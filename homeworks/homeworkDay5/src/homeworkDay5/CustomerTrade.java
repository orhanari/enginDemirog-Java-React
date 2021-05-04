package homeworkDay5;

public class CustomerTrade {
	public void sellProduct(Customer customer, Product product) {
		if (customer.getStatus()) {
			System.out.println(product.getGameName() + " oyunu, " + String.format("%.4g", product.getGamePrice()) + " TL karşılığında " + customer.getFirstName() + " adlı müşteriye satılmıştır.");
		}
		else {
			System.out.println("Satış başarısız, müşteri doğrulanmamış!");
		}
	}
}
