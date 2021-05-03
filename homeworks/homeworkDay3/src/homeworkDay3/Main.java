package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.name = "Engin Demiroð";
		instructor.phone = "ÇOKGÝZLÝNUMARA";
		instructor.mail = "bunubilinyeter@kodlama.io";
		// Instructor içerisindeki deðiþkenleri çaðýrýyoruz
		instructor.instructorId = 12345;
		instructor.companyName = "Kodlama.io";
		// Instructor içerisindeki deðiþkenleri çaðýrýyoruz
		
		Student student = new Student();
		student.id = 1;
		student.name = "Orhan ARI";
		student.phone = "ÇOKGÝZLÝNUMARA";
		student.mail = "bunubilinyeter@kodlama.io";
		// Student içerisindeki deðiþkenleri çaðýrýyoruz
		student.studentId = 12345;
		student.schoolName = "Okulumuz Kodlama.io, Hocamýz Engin Demiroð";
		// Student içerisindeki deðiþkenleri çaðýrýyoruz
		
		String[] courses = {"Java", "C#"};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.registerUser(instructor); // Extend edilen UserManager metodlarý
		instructorManager.loginUser(instructor); // Extend edilen UserManager metodlarý
		instructorManager.addCourse(courses);
		
		System.out.println("");// Console'a boþluk ekle
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerUser(student); // Extend edilen UserManager metodlarý
		studentManager.loginUser(student); // Extend edilen UserManager metodlarý
		studentManager.registerCourse(courses);
		
		
		
		
		
		
	}

}
