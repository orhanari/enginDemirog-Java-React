package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		// this, class i�erisindeki de�i�keni se�mek i�in kullan�l�r.
		
		this(); //Yukar�daki constructor'�n �al��mas�n� istiyorsak.
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
