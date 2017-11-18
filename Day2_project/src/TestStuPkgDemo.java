import com.cg.uas.bat.Batch;
import com.cg.uas.stu.Student;;
public class TestStuPkgDemo {
	public static void main(String[] args) {
		Batch javaBatch= new Batch("JEE_ABRG_FS",
				"8:30A.M. To 7:30 P.M.",
				"Vaishali Srivastava");
		
		Batch autoTestBatch=new Batch("AUTO_VNV_FS_PT",
					"9:30A.M. To 8:30 P.M.",
					"Amrutha Rakhonde");
			
		Student tripti= new Student(234556,"Tripti Sharma", javaBatch);
		Student sameer= new Student(234789,"Sameer Kanse", autoTestBatch);
		
		System.out.println("************All Batch Info***************");
		System.out.println(tripti.dispStuInfo());
		System.out.println(sameer.dispStuInfo());
		
	}
}
