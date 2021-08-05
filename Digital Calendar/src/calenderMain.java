/**
*	Name : Muhammad Talha Sohail
*	RollNo: 005-BSCS-19-B
**/
import java.util.Scanner;
import java.io.*;
public class calenderMain
{
	
    public static void clearScreen()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String []args) throws Exception
    {
        int hour,minute,seconds,date;
        int month,day,year;
        Scanner s = new Scanner(System.in);
		
		System.out.println("=============================================");
        
		System.out.print("Enter Seconds : ");
        seconds= s.nextInt();

        System.out.print("Enter Minutes : ");
        minute = s.nextInt();

        System.out.print("Enter Hours : ");
        hour = s.nextInt();

        System.out.print("Enter Date : ");
        date= s.nextInt();

        System.out.print("Enter Day Number : ");
        day= s.nextInt();

        System.out.print("Enter Month number : ");
        month= s.nextInt();

        System.out.print("Enter Year : ");
        year= s.nextInt();

//------------------------------------------------creating object

        digitalCalendar dc = new digitalCalendar(seconds,minute,hour,date,day,month,year);

//--------------------------------------------------------------Print outputs	
     
        System.out.println("=============================================");   
		/**
         * for loop will show digital calendar to screen
         * and Thread.sleep will pause for 1 second
        **/

        for(int i=1;i>0;i++)
        {
			clearScreen();
            dc.displayCalendarClock();
            Thread.sleep(1000);
            dc.tickClockCalendar();
        }
    }
}
