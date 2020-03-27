import java.util.Scanner;

/**
 * Asked by Sai Sreshtaa Turaga & Devin Nimesh Amalean
 * What is the meaning of return on line 27?
 */
public class Q1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (!in.hasNextDouble()) 
        {
            String word = in.nextLine();
            System.err.println(word + " is not a number");

            in.close();
            
            // Returns from main i.e., gives control back to operating system
            // The alternative below is also used in a similar manner 
            // It is more general and works well when scripting your programs from console
            return; // System.exit(-1); 
        }

        double x = in.nextDouble();
        
        if (x >= 0) {
            double y = Math.log(x);
            System.out.println("The log is " + y);
        } else {
            System.out.println("The log is undefined");
        }

        in.close();
    }
}
