/**
 * @Author: Yibo Bao
 * Description: This program will show the fibonacci list by given number
 *  it will show the given number of items in fibonacci 
 */
import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateFib(2));
		System.out.println(calculateFib(3));
		System.out.println(calculateFib(10));
		System.out.println(calculateFib(100));
	}
	/*
	 * @parameter:number of items
	 * @return: lists of fibonacci
	 */
	private static ArrayList<Integer> calculateFib(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int count =0;
		int num1 = 1;
		int num2 = 1;
		while(count<i) {
			l1.add(num1);
			int num3 = num1+num2;
			num1 = num2;
			num2=num3;
			count+=1;
		}
		return l1;
	}

}
