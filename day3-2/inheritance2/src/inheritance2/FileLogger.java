package inheritance2;

public class FileLogger extends Logger{
	// Base'deki log blo�unun �al��mas�n� istemiyoruz ve �zerine yazarak, buradaki void'de yer alan kodlar�m�z� �al��t�r�yoruz.
	// Override, sadece extend edilen yerde yani base'deki kodu ezdi�imizi g�steriyoruz.
	@Override
	public void log() {
		System.out.println("Dosya logland�");
	}
}
