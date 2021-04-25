package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		// Çıktýda iki kez "Ben çalýţtým" yazmasýnýn sebebi, iki kere Product() constructor çađýrdýđýmýz içindir.
		// Ýlk satýr ise içerisinde deđiţkenler olan constructor ile bađýntýlýdýr.
		// Yani ayný adda iki constructor tanýmlanabilir ve iţlem durumlarýna göre belirli constructor çađýrýlýr.
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM");
		
		Product product2 = new Product(); //Referans oluţturma, instance
		product2.id = 2;
		product2.name="Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB RAM";
		
		Product product3 = new Product(); //Referans oluţturma, instance
		product3.id = 3;
		product3.name="HP 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB RAM";
		
		
		
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println("Dizideki eleman sayýlarý: " + products.length);
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev / Bahçe";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
	}

}
