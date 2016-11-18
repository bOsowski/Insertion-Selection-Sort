package data;

public class Date implements Comparable<Date>{
	
	private final int month, day, year;
	
	public Date(int m, int d, int y)
	{
		month =m;
		day = d;
		year = y;
	}

	public int compareTo(Date that)
	{
		if (this.year < that.getYear()) return -1;
		if (this.year > that.getYear()) return +1;
		if (this.month < that.getMonth()) return -1;
		if (this.month > that.getMonth()) return +1;
		if (this.day < that.getDay()) return -1;
		if (this.day > that.getDay()) return +1;
		return 0;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return "Date [month=" + this.month + ", day=" + this.day + ", year=" + this.year + "]";
	}
	
	

}
