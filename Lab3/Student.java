public class Student extends Person {
	private int numberOfCourses = 0;
	private String [] courseCodes = new String[20];
	private int [] grades = new int[20];
	private static int max = 20;
	
	public Student(String name, String address, int idNum) {
		super(name, address, idNum);
	}
	
	public void addGrade(String courseName, int grade) {
		courseCodes [numberOfCourses] = courseName;
		grades [numberOfCourses] = grade; 
		numberOfCourses++;
	}
	
	public void printGrade() {
		for (int i = 0; i<numberOfCourses; i++) {
			System.out.println(courseCodes[i] + ":" +grades[i]);
		}
	}
	
	public String toString() {
        return ("Student: " + super.toString());
        }
}
