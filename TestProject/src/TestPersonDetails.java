import java.util.Scanner;

public class TestPersonDetails {

		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			Person persons[] = new Person[10];
			Date dob[] = new Date[10];
			System.out.println("Enter number of persons: ");
			int num= sc.nextInt();
			for(int i=0;i<num;i++)
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
				
				dob[i]=new Date(day,mon,year);
				persons[i]=new Person(panNo, perName, personSal,dob[i]);
				
				}
			for(int i=0; i<num;i++)
			{
				System.out.println(" "+persons[i].dispPersonInfo());
			}
			
			
		sc.close();
		}

	

}
