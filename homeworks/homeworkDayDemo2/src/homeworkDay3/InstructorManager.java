package homeworkDay3;

public class InstructorManager extends UserManager{
	//Instructor - Eğitmen
	public void addCourse(String[] courses) {
		for(String course : courses) {
			System.out.println("Kurs eklendi: " + course);
		}
	}
}
