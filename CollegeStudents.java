import java.util.Scanner;

/**
 * Total cost of living for a student. Depending on whether they're living on campus or elsewhere.
 * @author tianran
 *
 */

public class CollegeStudents {
	Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("What would you like to do?");
		System.out.print("A)dd a student"
				+ "\nL)ist students"
				+ "\nD)elete a student from the list"
				+ "\nC)alculate average cost of living"
				+ "\nS)elect an individual student");
	}
}
