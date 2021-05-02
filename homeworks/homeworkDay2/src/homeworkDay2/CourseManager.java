package homeworkDay2;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kurs eklendi: \t\t" + course.courseTitle);
	}
	public void updateCourse(Course course) {
		System.out.println("Kurs güncellendi: \t" + course.courseTitle);
	}
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi: \t\t" + course.courseTitle);
	}
}
