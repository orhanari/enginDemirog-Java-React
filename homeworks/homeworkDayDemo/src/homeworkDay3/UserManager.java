package homeworkDay3;

public class UserManager{
	public void registerUser(User user) {
		System.out.println("Kayýt baþarýlý: " + user.name);
	}
	public void loginUser(User user) {
		System.out.println("Giriþ baþarýlý: " + user.name);
	}
	public void logoutUser(User user) {
		System.out.println("Çýkýþ baþarýlý: " + user.name);
	}
}
