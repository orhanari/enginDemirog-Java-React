package homeworkDay3;

public class StudentManager extends UserManager{
	//Student > Öğrenci
	public void registerCourse(String[] courses) {
		for(String course : courses) {
			System.out.println("Kursa kayıt olundu: " + course);
		}
	}
}
