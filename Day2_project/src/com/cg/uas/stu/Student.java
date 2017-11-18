package com.cg.uas.stu;
import com.cg.uas.bat.Batch;

public class Student 
{
	private int rollNo;
	private String stuName;
	private Batch stuBatch;
	public Student() {  }
	public Student(int rollNo, String stuName, Batch stuBatch) 
	{
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.stuBatch = stuBatch;
	}
	public String dispStuInfo() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName
				+ ", stuBatch=" + stuBatch.dispBatchInfo() + "]";
	}
	
	
}
