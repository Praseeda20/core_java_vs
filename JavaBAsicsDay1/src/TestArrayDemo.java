
public class TestArrayDemo {

	public static void main(String[] args) {
		int markArr[]= new int[4];
		markArr[0]=90;
		markArr[1]=10;
		markArr[2]=45;
		markArr[3]=78;
		
		for(int i=0; i<markArr.length;i++)
		{
			System.out.println("markArr["+i+"]: "+markArr[i]);
		}
		System.out.println("************All Cities**************");
		String []cityList={"Pune","Mumbai","Chennai","Kochi"};
		for(int i=0;i<cityList.length;i++)
		{
			System.out.println("cityList["+i+"]: "+cityList[i]);
		}
		System.out.println("************2D Array*****************");
		int A[][]= new int[3][2];
		A[0][0]=9;
		A[0][1]=8;
		A[1][0]=7;
		A[1][1]=6;
		A[2][0]=5;
		A[2][1]=4;
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(" "+A[i][j]);
			}
			System.out.println();
		}
								
		
									

	}

}
