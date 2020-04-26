
public class ObjectsFromScratch 
{
    public static void main(String[] args) 
    {
        String name = "Alan Turing";
        String upperName = name.toUpperCase();
        String lowerName = name.toLowerCase();

        System.out.println();
        System.out.println(upperName);
        System.out.println(lowerName);
        System.out.println(name);
        System.out.println();

        String text = "Computer Science is fun!";
        String text2 = text.replace("Computer Science", "CS");

        System.out.println(text);
        System.out.println(text2);
    }
}