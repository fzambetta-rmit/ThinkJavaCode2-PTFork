public class StringsArray {

public static void main(String args[])
 {
    String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
    String myTopping = "Pepperoni";

    System.out.println("-------");
    for (String topping: toppings)
    {
        System.out.println(topping);
    }

    System.out.println("-------");
    for (String topping: toppings)
    {
        if (topping.equals(myTopping))
            System.out.println("Found!");
        else
            System.out.println("Not Found!");
    }

    System.out.println("-------");
    for (String topping: toppings)
    {
        System.out.println(topping.replace('e','*'));
    }
    System.out.println("-------");
 }   

}