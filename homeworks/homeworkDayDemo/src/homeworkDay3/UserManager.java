package homeworkDay3;

public class UserManager{
	public void registerUser(User user) {
		System.out.println("Kay�t ba�ar�l�: " + user.name);
	}
	public void loginUser(User user) {
		System.out.println("Giri� ba�ar�l�: " + user.name);
	}
	public void logoutUser(User user) {
		System.out.println("��k�� ba�ar�l�: " + user.name);
	}
}
