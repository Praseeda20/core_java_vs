
public class TestPersonDemos {
	public static void main(String[] args) {

		Date vDOB = new Date(12, 01, 1995);
		Date aDOB = new Date(10, 4, 1998);
		Date pDOB = new Date(11, 11, 1996);

		Person veena = new Person("CHC890", "Veena K", 40000.0f, vDOB);
		Person abhi = new Person("SDF567", "Abhishek S", 50000.0f, aDOB);

		System.out.println(" " + veena.dispPersonInfo());
		System.out.println(" " + abhi.dispPersonInfo());

		Person pranita = new Person("CASD800", "Pranita", 10000.0f, Gender.F,
				pDOB);
		System.out.println(" " + pranita.dispPersonInfo());
	}
}
