package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		// Çýktýda iki kez "Ben çalýþtým" yazmasýnýn sebebi, iki kere Product() constructor çaðýrdýðýmýz içindir.
		// Ýlk satýr ise içerisinde deðiþkenler olan constructor ile baðýntýlýdýr.
		// Yani ayný adda iki constructor tanýmlanabilir ve iþlem durumlarýna göre belirli constructor çaðýrýlýr.
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10);
		
		Product product2 = new Product(); //Referans oluþturma, instance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(1);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
