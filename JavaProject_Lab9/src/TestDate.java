
public class TestDate {

	public static void main(String[] args) {
		//Test constructor and toString()
		Date d1 = new Date (2023,2,8);
		System.out.println(d1);
		System.out.println();
		
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		//12/23/2023
		System.out.println(d1);
		System.out.println("Year  is: "+d1.getYear());
		//Year is: 2023
		System.out.println("Month is: "+d1.getMonth());
		//Month is: 12
		System.out.println("Day   is: "+d1.getDay());
		//Day is: 23
		
		//Test setDate()
		System.out.println();
		d1.setDate(2024, 1, 16);
		System.out.println(d1);

	}

}
