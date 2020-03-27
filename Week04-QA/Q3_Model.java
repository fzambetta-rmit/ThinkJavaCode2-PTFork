import java.util.Scanner;

/**
 * Asked by Ryan Le-Nguyen
 * Invoking methods from menu
 */
public class Q3_Model 
{
    public void runMenu() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (!in.hasNextInt()) {
            String word = in.nextLine();
            System.err.println(word + " is not a number");

            in.close();
            return;  
        }

        int option = in.nextInt();
        
        switch(option)
        {
            case 1:
                printMsg1();
                break;
            
            case 2:
                printMsg2();
                break;
            default:
                System.err.println("Unknown option!");
                break;
        }

        in.close();
    }

    public void printMsg1()
    {
        System.out.println("I am message #1!");
    }

    public void printMsg2()
    {
        System.out.println("I am message #2!");
    }
}
