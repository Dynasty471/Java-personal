
/**
 * This class is meant to keep track of student names, and their individual costs of living.
 * @author tianran
 *
 */
public class Student {
	private String housing;
	private String name;
	private int age;
	private double durationOfStay;
	private double weeklyExpenses;
	private static final double weeklyExpenseCap = 3000;
	

	/**
	 * Constructor for the student class
	 * 
	 * @param housing is the initial type of housing
	 * @param name is the name of the student
	 * @param durationOfStay is the length of stay for this student on a yearly basis
	 * @param weeklyExpenses is the amount in weekly expenses for a student.
	 */
	public Student(String housing, String name, int age, double durationOfStay, double weeklyExpenses) {
		// Have to make sure housing matches one of the two options.
		if (validateHousing(housing)) {
			this.housing = housing;
		}
		// No need to validate name
		this.name = name;
		// Need to make sure the duration of stay is reasonable/possible
		if (validateDuration(durationOfStay)) {
			this.durationOfStay = durationOfStay;
		}
		// Need to makes sure the weekly expenses entered are reasonable.
		if (validateExpenses(weeklyExpenses)) {
			this.weeklyExpenses = weeklyExpenses;
		}
	}
	
	/**
	 *  Ensures the housing value used is one of either dorm or commuting.
	 *  All other choices are invalid.
	 *  
	 * @param housing is the value being checked.
	 * @return true if the value is valid.
	 */
	private boolean validateHousing(String housing) {
		if (housing.equalsIgnoreCase("dorm") || housing.equalsIgnoreCase("commuting")) {
			return true;
		}
		else {
			System.out.println("You entered an invalid value for housing");
			return false;
		}
	}
	
	/**
	 *  Ensures the age value used is reasonable.
	 * @param age is the value being checked.
	 * @return true if the value is valid.
	 */
	private boolean validateAge(int age) {
		if ((age >= 10) && (age < 140)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Ensures the durationOfStay value used is a valid duration between 1 and 365 days.
	 * 
	 * @param durationOfStay is the value being checked.
	 * @return true if the value is valid
	 */
	private boolean validateDuration(double durationOfStay) {
		if ((durationOfStay >= 1) && (durationOfStay <= 365)) {
			return true;
		}
		else {
			System.out.println("You entered an invalid value for duration of stay");
			return false;
		}
	}
	
	/**
	 * Ensures the weeklyExpenses values used is a valid weekly expense.
	 * @param weeklyExpenses
	 * @return true if the value is valid.
	 */
	private boolean validateExpenses(double weeklyExpenses) {
		if ((weeklyExpenses >= 0) && (weeklyExpenses <= weeklyExpenseCap)) {
			return true;
		}
		else {
			System.out.println("You entered an invalid value for weekly expenses");
			return false;
		}
	}
	
	/**
	 * Getter for the housing attribute
	 * @return is the current value of housing.
	 */
	public String getHousing() {
		return this.housing;
	}
	
	/**
	 * Getter for the name attribute
	 * @return is the current value of name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Getter for the age attribute
	 * @return is the current value of age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Getter for the duration of stay attribute
	 * @return is the current duration of stay
	 */
	public double getDuration() {
		return this.durationOfStay;
	}
	
	/**
	 * Getter for the weekly expenses attribute
	 * @return is the current weekly expenses amount
	 */
	public double getExpenses() {
		return this.weeklyExpenses;
	}
	
	/**
	 * Setter for the housing attribute.
	 * 
	 * @param housing is the value you would like to set into the housing attribute
	 */
	public void setHousing(String housing) {
		if (validateHousing(housing)) {
			this.housing = housing;
		}
		else {
			System.out.println("You did not enter a valid form of housing.");
		}
	}
	
	/**
	 * Setter for the name attribute.
	 * @param name is the value you would liek to set into the name attribute.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}
		else {
			System.out.println("You did not enter a valid age.");
		}
	}
	
	/**
	 * Setter for the duration of stay attribute
	 * @param durationOfStay is the value you would like to set into the duration of stay.
	 */
	public void setDuration(double durationOfStay) {
		if (validateDuration(durationOfStay)) {
			this.durationOfStay = durationOfStay;
		}
		else {
			System.out.println("You did not enter a valid duration of stay.");
		}
	}
	
	/**
	 * Setter for the weekly expenses attribute
	 * @param weeklyExpenses is the value you would like to set into the weekly expenses attribute.
	 */
	
	public void setweeklyExpenses(double weeklyExpenses) {
		if (validateExpenses(weeklyExpenses)) {
			this.weeklyExpenses = weeklyExpenses;
		}
		else {
			System.out.println("You did not enter a valid value for weekly expenses.");
		}
	}
	
}
