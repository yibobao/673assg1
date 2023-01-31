/**
 * @author Yibo Bao
 * Description: This program is mainy used to combined one string list and one integer list
 * and it will output with a list that contains all of the contents of both file.
 */
import java.util.ArrayList;

public class combinelists {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(1);
		l1.add(2);
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("b");
		l2.add("c");
		l2.add("b");
		l2.add("c");
		ArrayList<String> l3 = combine(l1,l2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
	private static ArrayList<String> combine(ArrayList<Integer> l1, ArrayList<String> l2) {
		int times = 0;
		int i;
		int judge;
		ArrayList<String> l3 = new ArrayList<String>();
		if(l1.size()<l2.size()) {
			times=l1.size();
			judge=1;
		}
		else {
			times= l2.size();
			judge=2;
		}
		for(i =0;i<times;i++) {
			l3.add(Integer.toString(l1.get(i)));
			l3.add(l2.get(i));
		}
		if (judge ==2){
			for(int j =i;j<l1.size();j++) {
				l3.add(Integer.toString(l1.get(j)));
			}
		}
		if (judge ==1){
			for(int j =i;j<l2.size();j++) {
				l3.add((l2.get(j)));
			}
		}
		
		return l3;
	}
}
