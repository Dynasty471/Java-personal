import java.util.ArrayList;

/**
 * This class is meant to maintain to the list of students kept in the cost of housing database.
 * @author tianran
 */

public class StudentList {
	private ArrayList<Student> studentList;
	
	/**
	 * Constructor
	 */
	public StudentList() {
		studentList = new ArrayList<Student>();
	}
	
	/**
	 * Adds a new student to the list
	 * @param student is the student object added.
	 */
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	
	public void removeStudent(Student student) {
		studentList.remove(student);
	}
}
