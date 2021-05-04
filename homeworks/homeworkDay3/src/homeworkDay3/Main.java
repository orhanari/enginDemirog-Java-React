package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.name = "Engin Demiroğ";
		instructor.phone = "ÇOKGİZLİNUMARA";
		instructor.mail = "bunubilinyeter@kodlama.io";
		// Instructor içerisindeki değişkenleri çağırıyoruz
		instructor.instructorId = 12345;
		instructor.companyName = "Kodlama.io";
		// Instructor içerisindeki değişkenleri çağırıyoruz
		
		Student student = new Student();
		student.id = 1;
		student.name = "Orhan ARI";
		student.phone = "ÇOKGİZLİNUMARA";
		student.mail = "bunubilinyeter@kodlama.io";
		// Student içerisindeki değişkenleri çağırıyoruz
		student.studentId = 12345;
		student.schoolName = "Okulumuz Kodlama.io, Hocamız Engin Demiroğ";
		// Student içerisindeki değişkenleri çağırıyoruz
		
		String[] courses = {"Java", "C#"};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.registerUser(instructor); // Extend edilen UserManager metodları
		instructorManager.loginUser(instructor); // Extend edilen UserManager metodları
		instructorManager.addCourse(instructor, courses);
		
		System.out.println("");// Console'a boşluk ekle
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerUser(student); // Extend edilen UserManager metodları
		studentManager.loginUser(student); // Extend edilen UserManager metodları
		studentManager.registerCourse(student, courses);
		
		
		
		
		
		
	}

}
