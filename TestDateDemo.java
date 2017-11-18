
public class TestDateDemo {

	public static void main(String[] args) {
		Date myDOJ=new Date();
		myDOJ.setDate(25, 10, 2017);
		System.out.println("My DOJ: "+myDOJ.dispDate());
		
		Date otherDOJ=new Date();
		otherDOJ.setDate(15, 11, 2017);
		System.out.println("Other's DOJ: "+otherDOJ.dispDate());
		
	}

}
