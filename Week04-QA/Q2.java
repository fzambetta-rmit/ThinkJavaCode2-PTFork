import java.util.Scanner;

/**
 * Asked by Aaron Fisher
 * Condensing OR clauses in a conditional
 */
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an animal: ");
        String animal = in.nextLine().toLowerCase();
        
        /*
        boolean animalFlag = animal.equals(dog) || animal.equals("cat");
        if (animalFlag)
        {
            // Right kind of animals 
        }
        else
        {
            // Wrong kind of animals 
        }
        */
        
        /*
        if (animal.equals(dog) || animal.equals("cat") )
        {
            // DO SOMETHING HERE!
        }
        else if (animal.equals("bird"))
        {
            // DO SOMETHING ELSE
        }
        // etc. etc.
        */

        switch(animal)
        {
            case "dog":
            case "cat":
                System.out.println("I have four legs");
                break;

            case "bird":
                System.out.println("I have two legs");
                break;
            
            case "snake":
                System.out.println("I have no legs!");
                break;

            default:
                System.out.println("Unknown animal...");
                break;
        }
  

        in.close();
    }
}
