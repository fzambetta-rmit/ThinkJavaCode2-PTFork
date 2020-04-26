import java.math.BigInteger;

/**
 * Demonstrates uses of objects and wrappers.
 */
public class Wrappers 
{

    public static void main(String[] args) 
    {
        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num);

        int number = 12345;
        String strNum = Integer.toString(number);
        System.out.println(strNum);
    }

}
