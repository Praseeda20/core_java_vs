class Greet
{
	public static void main(String aa[])
	{
		System.out.println("Welcome to capgemini");
	}
}


public class Welcomes
{
	public static void main(String aa[])
	{
		String name=aa[0];
		String city=aa[1];
		int mySal=Integer.parseInt(aa[2]);
		int age=Integer.parseInt(aa[3]);
		System.out.println("Happy Birthday: "+name);
		System.out.println("Your City: "+city);
		System.out.println("Your salary: "+mySal);
		System.out.println("Your Age: "+age);
	
		if(mySal<25000)
			System.out.println("Grade D");
		else if(mySal<=25000 && mySal<=50000) 
			System.out.println("Grade C");
		else if(mySal<=50000 && mySal<=75000) 
			System.out.println("Grade B");
		else 
			System.out.println("Grade A");
		System.out.println("----Loop Syntax----");	
		for(int j=0;j<5;j++)
		{
			System.out.println("j=" +j);
		}
	}
}