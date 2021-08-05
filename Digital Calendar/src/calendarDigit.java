/**
*	Name : Muhammad Talha Sohail
*	RollNo: 005-BSCS-19-B
**/
public class calendarDigit
{
    /**
     * Instance variables are private.
     **/
    private int date;
    private int day;
    private int month;
    private int year;


//---------------------------------------------calenderDigit is a parameterized-constructor

    public calendarDigit(int date,int day,int month,int year)
    {
        this.date=date;
        this.day=day;
        this.month=month;
        this.year=year;
    }

//------------------------------------------------------------SETTER METHODS

    // setDate method will set value of date.
    public void setDate(int d)
    {
        date = d;
    }

    // setDay method will set value of day.
    public void setDay(int dy)
    {
        day=dy;
    }
    // setMonth method will set value of month.
    public void setMonth(int m)
    {
        month=m;
    }

    // setYear method will set value of year.
    public void setYear(int y)
    {
        year=y;
    }

//--------------------------------------------------------------GETTER METHODS

    // getYear method will return value of Year.
    public int getYear()
    {
        return year;
    }

    // getMonth method will return value of month.
    public int getMonth()
    {
        return month;
    }

    // getDay method will return value of day.
    public int getDay()
    {
        return day;
    }

    // getDate method will return value of date.
    public int getDate()
    {
        return date;
    }
//----------------------------------------------------------------------------------------------------------------||
    // incrDateDay method will increment the date,day,month and year.
    public void incrDateDay()
    {

        int limit = 0;

        //switch will return the limit for a month
        switch (month)
        {
            case 1:
            {
                limit=31;
                break;
            }
            case 2:
            {
                int leapYear = 0;
                while (leapYear > -1)
                {   
                    // Count all years that are divisible by 4 to be a leap year.
                    leapYear=leapYear+4;

                    // If the year inputted is a leap year, the days of the month will be 29.
                    if (year == leapYear)
                    {
                        limit = 29;
                        break;
                    }

                    else 
                    {
                        limit = 28;
                    }
			    }
                break;
            }
            case 3:
            {
                limit=31;
                break;
            }
            case 4:
            {
                limit=30;
                break;
            }
            case 5:
            {
                limit=31;
                break;
            }
            case 6:
            {
                limit=30;
                break;
            }
            case 7:
            {
                limit=31;
                break;
            }
            case 8:
            {
                limit=31;
                break;
            }
            case 9:
            {
                limit=30;
                break;
            }
            case 10:
            {
                limit=31;
                break;
            }
            case 11:
            {
                limit=30;
                break;
            }
            case 12:
            {
                limit=31;
                break;
            }
            default:
            {
                System.out.println("Plz, Enter Valid month number!!");
                System.exit(0);
            }

        }
        /**
         * below statement will increment day, if day will reaches to 8 ,
         * then it will be assigned as 1
         */
           day++;
        if(day==8)
        {
            day=1;
        }

        /**
         * below condtion will check , if date is reaches to limit,then month will
         * increment and date will be assigned as 1, else date will increment
         */
        if (date==limit) {
            month++;
            date = 1;
        }
        else
        {date++;}

        /**
         * below condition will check now, if month will equal to 13 ,
         * then year will increment and month will be assigned as 1.
         */
        if(month==13) {
            year++;
            month=1;
        }
    }
	
//-----------------------------------------------------------------------------------------------------------------------||
    /**
     * displayCalender method will print month and day name
     * input value of month and day will paas to array index
     * and return name
     */
    public String displayCalender()

    {
        String arrMonth[] ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String arrDay[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};


        if (date == 1 || date == 31)
        {
            return " ," + arrDay[day - 1] + " " + date + "st " + arrMonth[month - 1] + " ," + year;
        }
        else if (date == 2)
        {
            return " ," + arrDay[day - 1] + " " + date + "nd " + arrMonth[month - 1] + " ," + year;
        }
        else if (date == 3)
        {
            return " ," + arrDay[day - 1] + " " + date + "rd " + arrMonth[month - 1] + " ," + year;
        }
        else
        {
            return " ," + arrDay[day - 1] + " " + date + "th " + arrMonth[month - 1] + " ," + year;
        }



    }

}
