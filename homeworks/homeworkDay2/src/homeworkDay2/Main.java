package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		
		// Bu �devde ekstradan escape (ka���) karakterleri kullan�lm��t�r.
		// \n : Yeni sat�r
		// \t : Tab
		
		//Kurslar�n oldu�u �zellik nesneleri
		Course course1 = new Course(
				1,
				"images/course1.jpg", 
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java & React)", 
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n...", 
				"Long Text, HTML vs.", 0);
		
		Course course2 = new Course(
				2,
				"images/course2.jpg", 
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# & Angular)", 
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n...", 
				"Long Text, HTML vs.", 2);
		
		Course[] courses = {course1, course2};
		for(Course course : courses) {
			System.out.println("Kurs Ad�: " + course.courseTitle);
			System.out.println("Kurs A��klamas�: " + course.courseShortDesc);
			if(course.coursePrice == 0) {
				System.out.println("Kurs �creti: �cretsiz\n");
			}
			else {
				System.out.println("Kurs �creti: " + course.coursePrice + " TL\n");
			}
		}
		
		
		//Kategorilerin oldu�u �zellik nesneleri
		CourseCategory courseCategory1 = new CourseCategory(1, "Java");
		CourseCategory courseCategory2 = new CourseCategory(2, "C#");
		
		CourseCategory[] courseCategories = {courseCategory1, courseCategory2};	
		for(CourseCategory courseCategory : courseCategories) {
			System.out.println("Kategori Ad�: " + courseCategory.categoryName + "");
		}
		
		
		System.out.println("\n");
		//Kurs i�lemlerinin yap�ld��� i� s�n�f� (ekleme, g�ncelleme, silme)
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.updateCourse(course2);
		courseManager.deleteCourse(course1);
	}
}
