/*Created by Bartosz Kosakowski
* 11/01/17
* Clock/calendar
*/
import java.time.*;


public class TimeTeller{
	public static void main (String [] args){
		TimeTeller timeteller = new TimeTeller();
		timeteller.timeStuff();
	}//end of main method

	public void timeStuff(){
		//get current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current date and time: " + currentTime);

		//gets just the date in YMD format
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date or something: " + date1);

		//get month, day, and seconds individually
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		System.out.println("Month: " + month + ", day: " + day + ", seconds: " + seconds);

		//not entirely sure what this gets tbh
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
      	System.out.println("date2: " + date2);

      	//12 december 2014
	     LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
	     System.out.println("date3: " + date3);
			
	     //22 hour 15 minutes
	     LocalTime date4 = LocalTime.of(22, 15);
	     System.out.println("date4: " + date4);
			
	     //parse a string
	     LocalTime date5 = LocalTime.parse("20:15:30");
	     System.out.println("date5: " + date5);
	}//end of timeStuff method
}//end of TimeTeller class