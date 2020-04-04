import java.util.Random;

public class GradesHistogram 
{
    public static int[] randomArray(int size) 
    {
        Random random = new Random();
        int[] a = new int[size];
        
        for (int i = 0; i < a.length; i++) 
            a[i] = random.nextInt(101);
     
        return a;
    }

    public static int inRange(int[] a, int low, int high) 
    {
        int count = 0;
        
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] >= low && a[i] < high) 
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        int[] scores = randomArray(30);
        
        int HD = inRange(scores, 80, 101);
        int DI = inRange(scores, 70, 80);
        int CR = inRange(scores, 60, 70);
        int PA = inRange(scores, 50, 60);
        int NN = inRange(scores, 0, 50);

        System.out.println("The grade distribution is: ");
        System.out.printf("HD=%d - DI=%d - CR=%d - PA=%d - NN=%d",HD,DI,CR,PA,NN);
    }
}