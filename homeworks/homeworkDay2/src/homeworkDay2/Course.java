package homeworkDay2;

public class Course {
	//Özellik nesneleri
	int id;
	String courseImage;
	String courseTitle;
	String courseShortDesc;
	String courseContent;
	double coursePrice;
	
	public Course() {
		
	}
	
	public Course(int id, String courseImage, String courseTitle, String courseShortDesc, String courseContent, double coursePrice) {
		super();
		this.id = id;
		this.courseImage = courseImage;
		this.courseTitle = courseTitle;
		this.courseShortDesc = courseShortDesc;
		this.courseContent = courseContent;
		this.coursePrice = coursePrice;
	}
	
}
