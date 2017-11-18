
public class Emp {
	static{
		System.out.println("Static block is invoked when the classes are loaded in the memory by class loader");
	}
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
		public Emp()
		{  }
		
		public Emp(int empId, String empName, float empSal)
		{
			this.empId=empId;
			this.empName=empName;
			this.empSal=empSal;
			count++;
		}
		
		public static void getCount()
		{
			System.out.println("Emp count is:" +count);
		}
		public String dispEmpInfo()
		{
			getCount();
			return "Emp [empId= "+empId+", empName= "+empName+", Basic EmpSal= "+empSal+" ] ";
		}
		
		public float calcEmpAnnualSal()
		{
			return empSal*12;
		}
}


