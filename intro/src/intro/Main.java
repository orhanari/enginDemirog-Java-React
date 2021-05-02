package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu = "�nternet �ubeye Gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}
		else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "MSB Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler= {
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"MSB Kredisi",
				"MEB Kredisi"
		};
		
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		// Sonucun 100 ��kmas�n� �u �ekilde anlatabiliriz:
		/*
		 * Dizileri birbirleri ile e�itledi�imizde (sayilar1 = sayilar2) i�erisindeki veriler de�il,
		 * bu verilerin tutuldu�u bellekteki adresler ile e�itlenir.
		 * 
		 * �rnek olarak: sayilar1 101. adreste oldu�unu kabul edelim.
		 * sayilar2 102. adreste oldu�unu kabul edelim.
		 * sayilar1 = sayilar2 yapt���m�zda:
		 * sayilar1 art�k sayilar2'nin adresi ile e�itlenmi� olur.
		 * Bu adreste yap�lacak her de�i�iklikten etkilenecektir.
		 * 
		 * sayilar2[0] = 100 olarak bir atama yapt���m�zda, 102. adresteki de�er de�i�ecektir.
		 * sayilar1[0] ekrana yazd�rmak istedi�imizde, daha �nce e�itleme i�lemi yapt���m�z i�in
		 * sayilar1'de 102. adrese gidecek, 0. eleman� �a��racak ve ekrana 100 basacakt�r. 
		 * 
		 * */
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "Izmir";
		System.out.println(sehir1);
		
	}

}
