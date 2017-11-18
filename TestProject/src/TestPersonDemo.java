import java.util.Scanner;


public class TestPersonDemo 
{

	public static void main(String[] args) 
	{
		Person personDetail = new Person();
		Date personDOB= new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of persons: ");
		int num= sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter PAN ID: ");
			String panNo  = sc.next();
			
			System.out.println("Enter Name: ");
			String perName  = sc.next();
			
			System.out.println("Enter Salary: ");
			float personSal  = sc.nextFloat();
			
			System.out.println("Enter Day: ");
			int day  = sc.nextInt();
			
			System.out.println("Enter Month: ");
			int mon  = sc.nextInt();
			
			System.out.println("Enter Year: ");
			int year  = sc.nextInt();
			personDOB= new Date (day,mon,year);
			personDetail=new Person(panNo, perName, personSal,personDOB);
			
			System.out.println(" "+personDetail.dispPersonInfo());
		}
		
		sc.close();
	
	}

}
