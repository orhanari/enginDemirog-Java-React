package homeworkDay3;

public class InstructorManager extends UserManager{
	//Instructor - E�itmen
	public void addCourse(String[] courses) {
		for(String course : courses) {
			System.out.println("Kurs eklendi: " + course);
		}
	}
}
