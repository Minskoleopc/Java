package basics;

public class OverLoadingC {

	
	public void search(int x , int y) {
		System.out.println("Number Number ");
	}
	
	public void search(String x , int y) {
		System.out.println("String Number ");
	}
	
	public void search(String x , String y, String z) {
		System.out.println("String String String ");
	}
}
