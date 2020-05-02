/**
 * No error checking is performed in this class!
 * As an exercise, try to validate the values of days, months and years
 * PS=Years should start at Unix start time i.e, 1970.
 */
public class Date 
{

    private int year;
    private int month;
    private int day;

    private String[] shortMonthNames={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    public Date()
    {
        // Start of Unix time
        year = 1970;
        month = 1;
        day = 1;
    }

    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }    

    public String toString()
    {
        return ("Date: "+String.format(String.format("%02d : %s : %04d", day,shortMonthNames[month-1],year)));
    }

    public static String unixTime()
    {
        return ("Date: 01 : Jan : 1970");
    }

    public static void main(String args[])
    {
        Date myDate = new Date(2020,5,4);

        System.out.println(myDate);
        System.out.println(Date.unixTime());
    }
}