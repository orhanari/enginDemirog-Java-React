package homeworkDay3;

public class StudentManager extends UserManager{
	//Student > Öğrenci
	public void registerCourse(Student student, String[] courses) {
		for(String course : courses) {
			System.out.println(student.name + " kursa kayıt oldu: " + course);
		}
	}
}
