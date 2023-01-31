import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a word: ");
		String n = reader.next(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		if(judge(n)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}

	private static boolean judge(String n) {
		// TODO Auto-generated method stub
		int total = n.length();
		if(total ==0 | total==1) {
			return true;
		}
		if(total % 2==0) {
			int mid = total/2;
			int compare = mid-1;
			while(compare>=0) {
				if(n.charAt(mid)==n.charAt(compare)) {
					compare-=1;
					mid+=1;
				}
				else 
					return false;
			}
			return true;
		}
		else if(total%2==1) {
			int mid = total/2;
			int start = mid-1;
			int tail=mid+1;
			while(start>=0) {
				if(n.charAt(start)==n.charAt(tail)) {
					start-=1;
					tail+=1;
				}
				else 
					return false;
			}
			return true;
			
		}
		return true;
		
	}

}
