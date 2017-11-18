
public class TestEmpArrayDemo {

	public static void main(String[] args) {
		Emp emps[] = new Emp[3];
		emps[0]=new Emp(111,"Smitha",10000.0f);
		emps[1]=new Emp(111,"Dhruvi",20000.0f);
		emps[2]=new Emp(111,"Sameer",30000.0f);
		
		for(int i=0; i<emps.length;i++)
		{
			System.out.println(i+" emp info: "+emps[i].dispEmpInfo());
			System.out.println("Annual Salary: "+emps[i].calcEmpAnnualSal());
		}
	}

}
