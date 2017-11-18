
public class Employee {
	int empId;
	String ename;
	float empSal;
	char gender;
	
		public void Employee()
		{
			empId=0;
			ename=null;
			empSal=0.0f;
			gender=' ';
		}
		public Employee(int empId, String ename, float empSal, char gender)
		{
			this.empId=empId;
			this.ename=ename;
			this.empSal=empSal;
			this.gender=gender;
		}
		public String dispEmp()
		{
			return "Emp ID: "+empId+"\nEmp Name: "+ename+"\nEmp Salary: "+empSal+"/nGender: "+gender;
		}
}
