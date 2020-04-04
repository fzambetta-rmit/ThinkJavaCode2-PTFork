
public class ForEachLoop 
{
    public static void main(String[] args) 
    {
        double[] values={0.0, 1.2, 3.5, 9.1};

        // For loop
        for (int i = 0; i < values.length; i++) 
        {
            double value = values[i];
            System.out.println(value);
        }

        double total=0.0;
        // Enhanced for loop (for each)
        for (double value : values)
        {
             total += value;       
        }
        System.out.println(total); 
    }
}