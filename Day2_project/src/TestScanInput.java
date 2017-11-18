import java.util.*;
public class TestScanInput {
	static{
		System.out.println("Static block is invoked when the classes are loaded in the memory by class loader");
	}
	private static String city="Pune";
	public static void method1(){System.out.println("static ");}
	public void method2(){System.out.println("non_static ");}
	
	public static void main(String[] args) {
		TestScanInput tt= new TestScanInput();
		tt.method2();
		Scanner sc = new Scanner(System.in);
		method1();
		Emp emps[] = new Emp[10];
		System.out.println("Main class starts....");
		System.out.println("Enter the number of employees: ");
		int num= sc.nextInt();
		for(int i=0; i<num;i++)
		{
			System.out.println("Enter employeeID: ");
			int eid = sc.nextInt();
			
			System.out.println("Enter employee name: ");
			String ename = sc.next();
			
			System.out.println("Enter employee salary: ");
			float empsal = sc.nextFloat();
			
			emps[i]=new Emp(eid, ename, empsal);
		}

		for(int i=0; i<num;i++)
		{
			System.out.println("Emp info: "+emps[i].dispEmpInfo());
			System.out.println("Emp annual salary: "+emps[i].calcEmpAnnualSal());		
	}
		Emp.getCount();
	}
}