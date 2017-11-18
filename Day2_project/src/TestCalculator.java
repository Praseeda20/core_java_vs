class Calculator
{
	public void add(int num1, int num2)
	{
		System.out.println("Addition of 2 Integer: " +(num1+num2));
	}
	
	public void add(char num1, char num2)
	{
		System.out.println("Addition of 2 Char: " +(num1+num2));
	}
	
	public void add(int num1, int num2, int num3)
	{
		System.out.println("Addition of 3 Integer: " +(num1+num2+num3));
	}
	
	public void add(byte num1, byte num2)
	{
		System.out.println("Addition of 2 Byte: " +(num1+num2));
	}
	
	public void add(float num1, float num2)
	{
		System.out.println("Addition of 2 Float: " +(num1+num2));
	}
	
	public void add(double num1, double num2)
	{
		System.out.println("Addition of 2 Double: " +(num1+num2));
	}
	
	public void add(String num1, String num2)
	{
		System.out.println("Addition of 2 String: " +(num1+" "+num2));
	}
	
	public void add(Integer num1, Integer num2)
	{
		System.out.println("Addition of 2 Integer Wrapper: " +(num1+num2));
	}
}
public class TestCalculator {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(10, 20);
		c1.add(10, 20, 30);
		c1.add(10.0, 20.0);
		c1.add(10.0f, 20.0f);
		c1.add("Praseeda", "Prasannan");
		c1.add((byte)10,(byte) 20);
		c1.add('a','b');
		c1.add((Integer)10,(Integer)20);

	}

}
