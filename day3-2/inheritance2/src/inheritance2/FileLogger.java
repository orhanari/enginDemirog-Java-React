package inheritance2;

public class FileLogger extends Logger{
	// Base'deki log bloðunun çalýþmasýný istemiyoruz ve üzerine yazarak, buradaki void'de yer alan kodlarýmýzý çalýþtýrýyoruz.
	// Override, sadece extend edilen yerde yani base'deki kodu ezdiðimizi gösteriyoruz.
	@Override
	public void log() {
		System.out.println("Dosya loglandý");
	}
}
