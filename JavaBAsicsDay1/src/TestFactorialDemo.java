
class Factorial
{
	int num;
	public int calcFact(int number)
	{
		num=number;
		int fact=1;
		while(num>1)
		{
			fact=fact*num--;
		}
			return fact;
	}
}


public class TestFactorialDemo {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		Factorial obj1=new Factorial();
		System.out.println("Factorial of number is :" +obj1.calcFact(num));
		
	}

}
