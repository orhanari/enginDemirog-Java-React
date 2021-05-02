package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu = "Ýnternet Þubeye Gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "MSB Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler= {
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
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
		
		// Sonucun 100 çýkmasýný þu þekilde anlatabiliriz:
		/*
		 * Dizileri birbirleri ile eþitlediðimizde (sayilar1 = sayilar2) içerisindeki veriler deðil,
		 * bu verilerin tutulduðu bellekteki adresler ile eþitlenir.
		 * 
		 * Örnek olarak: sayilar1 101. adreste olduðunu kabul edelim.
		 * sayilar2 102. adreste olduðunu kabul edelim.
		 * sayilar1 = sayilar2 yaptýðýmýzda:
		 * sayilar1 artýk sayilar2'nin adresi ile eþitlenmiþ olur.
		 * Bu adreste yapýlacak her deðiþiklikten etkilenecektir.
		 * 
		 * sayilar2[0] = 100 olarak bir atama yaptýðýmýzda, 102. adresteki deðer deðiþecektir.
		 * sayilar1[0] ekrana yazdýrmak istediðimizde, daha önce eþitleme iþlemi yaptýðýmýz için
		 * sayilar1'de 102. adrese gidecek, 0. elemaný çaðýracak ve ekrana 100 basacaktýr. 
		 * 
		 * */
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "Izmir";
		System.out.println(sehir1);
		
	}

}
