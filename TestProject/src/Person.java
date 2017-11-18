enum Gender{
	M,F,Male,Female;
}
public class Person {
	private String panNo;
	private String perName;
	private float personSal;
	Gender perGender ;
	Date personDOB;
	
	public Person() {
		panNo="unknown";
		perName="unknown";
		personSal=0.0f;
		personDOB=new Date();	
	}

	public Person(String panNo, String perName, float personSal, Date personDOB) {
		this.panNo = panNo;
		this.perName = perName;
		this.personSal = personSal;
		this.personDOB = personDOB;
	}
	
	public Person(String panNo, String perName, float personSal, Gender perGender,
			Date personDOB) {
		this.panNo = panNo;
		this.perName = perName;
		this.personSal = personSal;
		this.perGender = perGender;
		this.personDOB = personDOB;
	}

	public String dispPersonInfo()
	{
		return "Person[panNo="+panNo+
				", perName=" +perName+
				", personSal=" +personSal+
				", personaDOB=" +personDOB.dispDate()+", Gender="+perGender+"]";
	}
	
	
	
}
