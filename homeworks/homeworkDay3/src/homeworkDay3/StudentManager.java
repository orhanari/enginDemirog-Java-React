package homeworkDay3;

public class StudentManager extends UserManager{
	//Student > ��renci
	public void registerCourse(String[] courses) {
		for(String course : courses) {
			System.out.println("Kursa kay�t olundu: " + course);
		}
	}
}
