package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		// this, class içerisindeki deðiþkeni seçmek için kullanýlýr.
		
		this(); //Yukarýdaki constructor'ýn çalýþmasýný istiyorsak.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
