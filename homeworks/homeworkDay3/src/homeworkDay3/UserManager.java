package homeworkDay3;

public class UserManager{
	public void registerUser(User user) {
		System.out.println("Kayıt başarılı: " + user.name);
	}
	public void loginUser(User user) {
		System.out.println("Giriş başarılı: " + user.name);
	}
	public void logoutUser(User user) {
		System.out.println("Çıkış başarılı: " + user.name);
	}
}
