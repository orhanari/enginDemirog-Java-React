package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.name = "Engin Demiro�";
		instructor.phone = "�OKG�ZL�NUMARA";
		instructor.mail = "bunubilinyeter@kodlama.io";
		// Instructor i�erisindeki de�i�kenleri �a��r�yoruz
		instructor.instructorId = 12345;
		instructor.companyName = "Kodlama.io";
		// Instructor i�erisindeki de�i�kenleri �a��r�yoruz
		
		Student student = new Student();
		student.id = 1;
		student.name = "Orhan ARI";
		student.phone = "�OKG�ZL�NUMARA";
		student.mail = "bunubilinyeter@kodlama.io";
		// Student i�erisindeki de�i�kenleri �a��r�yoruz
		student.studentId = 12345;
		student.schoolName = "Okulumuz Kodlama.io, Hocam�z Engin Demiro�";
		// Student i�erisindeki de�i�kenleri �a��r�yoruz
		
		String[] courses = {"Java", "C#"};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.registerUser(instructor); // Extend edilen UserManager metodlar�
		instructorManager.loginUser(instructor); // Extend edilen UserManager metodlar�
		instructorManager.addCourse(courses);
		
		System.out.println("");// Console'a bo�luk ekle
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerUser(student); // Extend edilen UserManager metodlar�
		studentManager.loginUser(student); // Extend edilen UserManager metodlar�
		studentManager.registerCourse(courses);
		
		
		
		
		
		
	}

}
