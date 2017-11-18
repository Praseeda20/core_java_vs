
public class Date {
	int day;
	int mon;
	int year;
	
		public void Date()
		{
			day=0;
			mon=0;
			year=0;
		}
		public void Date(int day, int mon, int year)
		{
			this.day=day;
			this.mon=mon;
			is.year=year;
		}
		public String dispDate()
		{
			return day+"/"+mon+"/"+year;
		}

}
