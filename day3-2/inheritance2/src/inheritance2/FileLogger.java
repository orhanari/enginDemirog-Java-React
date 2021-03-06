package inheritance2;

public class FileLogger extends Logger{
	// Base'deki log bloğunun çalışmasını istemiyoruz ve üzerine yazarak, buradaki void'de yer alan kodlarımızı çalıştırıyoruz.
	// Override, sadece extend edilen yerde yani base'deki kodu ezdiğimizi gösteriyoruz.
	@Override
	public void log() {
		System.out.println("Dosya loglandı");
	}
}
