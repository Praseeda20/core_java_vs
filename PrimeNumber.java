
public class PrimeNumber {
	int num,flag,mid;
	public int checkPrime(int num)
	{
		mid=num/2;
		if(num%2==0)
			return flag=1;
		else 
			for(int i=3;i<=mid;i+=2)
			{
				if(num%i==0)
					flag=1;
			}
	}		
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if 

	}

}
