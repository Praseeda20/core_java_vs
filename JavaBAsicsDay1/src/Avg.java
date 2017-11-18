class Avg{

		public static void main(String args[]){
		float sum=0,avg=0;
			for(int i=0;i<10;i++)
			{
				sum=sum+Integer.parseInt(args[i]);
			}
		
		avg=sum/10;
		System.out.println("Average is: "+avg);
			
		}
}