/**
 * @author:Yibo Bao
 * Description: show the multiplacation under 12.
 */
public class multiplacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showresult();
	}
	//print out the result;
	private static void showresult() {
		for(int i=1; i<=12;i++) {
			for(int j=1;j<=12;j++) {
				System.out.println(i+" * "+j+" = " +i*j);
			}
		}
	}

}
