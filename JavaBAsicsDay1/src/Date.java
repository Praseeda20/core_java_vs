
public class Date {
	int day;
	int mon;
	int year;
	
		public Date()
		{
			day=0;
			mon=0;
			year=0;
		}
		public Date(int day, int mon, int year)
		{
			this.day=day;
			this.mon=mon;
			this.year=year;
		}
		public String dispDate()
		{
			return day+"/"+mon+"/"+year;
		}

}
