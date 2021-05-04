package homeworkDay3;

public class InstructorManager extends UserManager{
	//Instructor - Eğitmen
	public void addCourse(Instructor instructor, String[] courses) {
		for(String course : courses) {
			System.out.println(instructor.name + " tarafından sisteme kurs eklendi: " + course);
		}
	}
}
