public class ClassWithStatic 
{
    public static void main(String[] args) 
    {
        justPrintSomethingStatic();

        ClassWithInstance cwi = new ClassWithInstance();
        cwi.justPrintSomethingInstance();
    }

    public static void justPrintSomethingStatic()
    {
        System.out.println("Just print something - STATIC!");
    }
}