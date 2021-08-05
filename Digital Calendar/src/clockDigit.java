/**
*	Name : Muhammad Talha Sohail
*	RollNo: 005-BSCS-19-B
**/

public class clockDigit
{
    /**
     *  digit variable (private) will hold value of sec,min and hours.
     * limit variable (private) will be constant and hold limit of sec,min and hours.
     **/
    private int digit;
    private final int limit;

    // clockDigit is a parameterized-constructor
    public clockDigit(int d, int l)
    {
        digit=d;
        limit=l;
    }

//-----------------------------------------------------------------SETTER METHOD

    /**
     * setDigit method will set the value of sec,min and hours to instance variable => digit
     */
    public void setDigit(int v)
    {
        digit = v;
    }

//-----------------------------------------------------------------GETTER METHOD

    // getDigit method will return digit
    public int getDigit()
    {
        return digit;
    }
//-----------------------------------------------------------------------------||
    /** incrementDigit method will increment the digit of sec,min and hours
     *  if it reaches to limit
     **/
    public void incrementDigit()
    {
        digit=(digit+1)%limit; /** this statement will increment the value and
                                 *  if it will reaches a limit_value then value will set to 0 **/
    }

//-----------------------------------------------------------------------------||
    //displayDigit method will print digit of time
    public String displayDigit()
    {
        if (digit<10)
        {
            // if digit is less than 0, then 0 will add to that number i.e: 01
            String d ="0"+digit;
            return d;
        }
        else
        {
            return (""+digit);
        }
    }


}
