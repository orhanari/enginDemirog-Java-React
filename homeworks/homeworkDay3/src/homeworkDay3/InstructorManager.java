package homeworkDay3;

public class InstructorManager extends UserManager{
	//Instructor - Eðitmen
	public void addCourse(String[] courses) {
		for(String course : courses) {
			System.out.println("Kurs eklendi: " + course);
		}
	}
}
