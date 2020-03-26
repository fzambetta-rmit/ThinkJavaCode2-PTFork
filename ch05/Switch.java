/**
 * Skeleton for main example in Chapter 5.
 */

import java.util.Scanner;

public class Switch 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("No call yet :-)");
        if (!in.hasNextInt()) {
            String word = in.nextLine();
            System.err.println(word + " is not a number");
            return;
        }

        String word;
        int number = in.nextInt();
        
        switch (number) {
            case 1:
                word = "one";
            break;
            case 2:
                word = "two";
            break;
            case 3:
                word = "three";
            break;
            default:
                word = "unknown";
            break;
        }
        System.out.println(word);

        in.close();
    }
}




