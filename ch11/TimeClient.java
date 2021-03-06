/**
 * Class that uses Time objects.
 */
public class TimeClient {

    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.9);
        
        System.out.println(time);

        Time newTime = new Time(9, 30, 0.0);
        //System.out.println(Time.printTime(time1)); // CANNOT DO 
        Time.printTime(newTime);
        System.out.println(newTime);

        // cannot access private variables from another class
        // System.out.println(time.hour);



        String s = time.toString();
        System.out.println(s);

        Time time1 = new Time(9, 30, 0.0);
        Time time2 = time1;
        Time time3 = new Time(9, 30, 0.0);

        System.out.println(time1 == time2);
        System.out.println(time1 == time3);
        System.out.println(time1.equals(time2));
        System.out.println(time1.equals(time3));
        System.out.println(time1.equals("09:30:00.0\n"));

        Time startTime = new Time(18, 50, 0.0);
        Time runningTime = new Time(2, 16, 0.0);
        Time endTime = Time.add(startTime, runningTime);

        // using the instance method
        endTime = startTime.add(runningTime);
    }

}
