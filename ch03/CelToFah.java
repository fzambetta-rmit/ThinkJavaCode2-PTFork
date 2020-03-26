import java.util.Scanner;

/**
 * Converts centimeters to feet and inches.
 */
public class CelToFah {

    public static void main(String[] args) {
        double celsius,fahrenheit ;
        
        final double c1 = 1.8, c2=32;

        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Temperature in Celsius: ");
        celsius = in.nextDouble();

        fahrenheit = (celsius*c1)+c2;        // convert and output the result
        System.out.printf("The temperature in Fahrenheit is %.2f \n",fahrenheit);

        in.close();
    }

}
