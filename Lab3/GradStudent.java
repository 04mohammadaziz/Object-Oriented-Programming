
public class GradStudent extends Student{
	private int numberOfCommittee = 0;
	private int examsTaken = 0;
	private int numberOfCourses = 0;
	private static final int examTrials = 6;
	private String [] exams = new String[20];
	private String [] results = new String [20];
	
	public GradStudent(String name, String address, int idNum) {
		super(name, address, idNum);
	}
	
	public void addGrade(String courseName, String grade) {
		exams [numberOfCourses] = courseName;
		results [numberOfCourses] = grade; 
		numberOfCourses++;
	}
	
	public void setCommitteeNum(int num) {
		numberOfCommittee = num;
	}
	
	public int getCommitteeNum() {
		return numberOfCommittee;
	}
	
	public String toString() {
        return ("Grad " +super.toString());
        }
	
	public void printExamGrade() {
		for (int i = 0; i<numberOfCourses; i++) {
			System.out.println(exams[i] + results[i]);
		}
	}
}