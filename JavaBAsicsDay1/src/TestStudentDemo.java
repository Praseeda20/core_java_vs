
public class TestStudentDemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollNo(112081);
		s1.setStudName("Praseeda");
		s1.setMarks(70);
		
		Student s2=new Student();
		s2.setRollNo(112082);
		s2.setStudName("Kritika");
		s2.setMarks(72);
		
		System.out.println("\nRoll No: "+s1.getRollNo()+
				" \nStudent Name: "+s1.getStudName()+
				" \nStudent Marks:"+s1.getMarks());
		
		System.out.println("\nRoll No: "+s2.getRollNo()+
				" \nStudent Name: "+s2.getStudName()+
				" \nStudent Marks:"+s2.getMarks());
		
	}
}
