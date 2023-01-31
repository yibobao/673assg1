/**
 * @author :Yibo Bao
 * Description:This program will judge if the user input year is a leap year 
 * or not.
 */
import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a year: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		if(leapYear(n)) {
			System.out.println(n+ " is a leap year");
		}
		else {
			System.out.println(n+" is not a leap yea r");
		}
	}
	/**
	 * @param the year
	 * @return if year is leap year or not.
	 */
	public static  boolean leapYear(int i) {
		 if (((i % 4 == 0) && (i % 100!= 0)) || (i%400 == 0)) {
			 return true;
		 }
		return false;
	}
}
