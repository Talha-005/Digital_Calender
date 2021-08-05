/**
*	Name : Muhammad Talha Sohail
*	RollNo: 005-BSCS-19-B
**/

public class digitalCalendar
{
    /**
     * creating objects of class clockDigit and calendarDigit
     */
    clockDigit minute;
    clockDigit hours;
    clockDigit seconds;
    calendarDigit Date;
    String time;
//-----------------------------------------------------------------------------||
    /**
     * digitalCalendar is a parameterized-constructor
     */
    public digitalCalendar(int sec, int min,int hour,int date,int day ,int month,int year)
    {
        if ((sec<61 && sec>=0) && (min<61 &&min>=0) && (hour<25 &&hour>=0))
        {
            seconds = new clockDigit(sec,60);
            minute = new clockDigit(min,60);
            hours = new clockDigit(hour,24);

            Date = new calendarDigit(date,day,month,year);

            time = hours.displayDigit()+" : "+minute.displayDigit()+" : "+seconds.displayDigit()+Date.displayCalender();
        }
        else
        {
            System.out.println("  ** plz enter Valid values **");
        }
    }
//-----------------------------------------------------------------------------||
    /**
     * SetTimeDayDate method will set values of second,minute,
     * hours,date,day,month and year
     */
    public void setTimeDateDay(int a,int b,int c,int date,int day ,int month,int year)
    {
        seconds.setDigit(a);
        minute.setDigit(b);
        hours.setDigit(c);
        Date.setMonth(month);
        Date.setDate(date);
        Date.setDay(day);
        Date.setYear(year);

        time = hours.displayDigit()+" : "+minute.displayDigit()+" : "+seconds.displayDigit()+Date.displayCalender();
    }
//-----------------------------------------------------------------------------||
    /**
     * tickClockCalender method will increment the values
     */
    public void tickClockCalendar( )
    {
        // increment seconds
        seconds.incrementDigit();
        if(seconds.getDigit()==0)
        {
            // increment minutes
            minute.incrementDigit();
            if(minute.getDigit()==0)
            {
                // increment hours
                hours.incrementDigit();
                if(hours.getDigit()==0)
                {
                    // increment date
                    Date.incrDateDay();
                    if(Date.getDate()==0)
                    {
                        // increment day
                        Date.incrDateDay();
                        if(Date.getDay()==0)
                        {
                            // increment month
                            Date.incrDateDay();
                            if(Date.getMonth()==0)
                            {
                                // increment year
                                Date.incrDateDay();
                            }
                        }
                    }
                }
            }
        }

        time = hours.displayDigit()+" : "+minute.displayDigit()+" : "+seconds.displayDigit()+Date.displayCalender();
    }
	
//-----------------------------------------------------------------------------||
    public void displayCalendarClock()
    {
        System.out.println(time);
    }




}
