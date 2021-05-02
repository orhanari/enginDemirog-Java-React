package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		// ��kt�da iki kez "Ben �al��t�m" yazmas�n�n sebebi, iki kere Product() constructor �a��rd���m�z i�indir.
		// �lk sat�r ise i�erisinde de�i�kenler olan constructor ile ba��nt�l�d�r.
		// Yani ayn� adda iki constructor tan�mlanabilir ve i�lem durumlar�na g�re belirli constructor �a��r�l�r.
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10);
		
		Product product2 = new Product(); //Referans olu�turma, instance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		Category category2 = new Category();
		category2.setId(1);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
