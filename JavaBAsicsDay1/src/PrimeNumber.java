
public class PrimeNumber {

	public int checkPrime(int num)
	{
		int mid,flag=0;
		mid=num/2;
		if(num%2==0)
		{
			flag=1;
		}
		else 
			for(int i=3;i<=mid;i+=2)
			{
				if(num%i==0)
					flag=1;
			}
		return flag;
	}		
	

	public static void main(String[] args) {
		int flag=0;
		int num = Integer.parseInt(args[0]);
		PrimeNumber obj1=new PrimeNumber();
		flag=obj1.checkPrime(num);
		if (flag==1)
			System.out.println("Number is a Prime Number ");
		else
			System.out.println("Number is not a Prime Number ");
				

	}

	}
