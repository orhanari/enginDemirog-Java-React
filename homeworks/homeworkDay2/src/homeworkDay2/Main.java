package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		
		// Bu ödevde ekstradan escape (kaçýþ) karakterleri kullanýlmýþtýr.
		// \n : Yeni satýr
		// \t : Tab
		
		//Kurslarýn olduðu özellik nesneleri
		Course course1 = new Course(
				1,
				"images/course1.jpg", 
				"Yazýlým Geliþtirici Yetiþtirme Kampý (Java & React)", 
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn...", 
				"Long Text, HTML vs.", 0);
		
		Course course2 = new Course(
				2,
				"images/course2.jpg", 
				"Yazýlým Geliþtirici Yetiþtirme Kampý (C# & Angular)", 
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn...", 
				"Long Text, HTML vs.", 2);
		
		Course[] courses = {course1, course2};
		for(Course course : courses) {
			System.out.println("Kurs Adý: " + course.courseTitle);
			System.out.println("Kurs Açýklamasý: " + course.courseShortDesc);
			if(course.coursePrice == 0) {
				System.out.println("Kurs Ücreti: Ücretsiz\n");
			}
			else {
				System.out.println("Kurs Ücreti: " + course.coursePrice + " TL\n");
			}
		}
		
		
		//Kategorilerin olduðu özellik nesneleri
		CourseCategory courseCategory1 = new CourseCategory(1, "Java");
		CourseCategory courseCategory2 = new CourseCategory(2, "C#");
		
		CourseCategory[] courseCategories = {courseCategory1, courseCategory2};	
		for(CourseCategory courseCategory : courseCategories) {
			System.out.println("Kategori Adý: " + courseCategory.categoryName + "");
		}
		
		
		System.out.println("\n");
		//Kurs iþlemlerinin yapýldýðý iþ sýnýfý (ekleme, güncelleme, silme)
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.updateCourse(course2);
		courseManager.deleteCourse(course1);
	}
}
