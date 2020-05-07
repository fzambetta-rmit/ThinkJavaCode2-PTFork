/**
 * Very simple, unoptimised and simplistic example of selection sort.
 * Feel free to improve following comments and making other changes
 * Use this as a starting point to implement selection sort in Deck.java
 */
public class SelectionSort 
{ 
    int[] arr;

    public SelectionSort(int[] myArray)
    {
        arr = myArray;
    }

    /**
     * A void print method. Can you covert this to overidding toString(), instead?
     * What are the trade offs?
     */
    public void PrintArray()
    {
        System.out.print("[");
        for(int i=0; i<arr.length-1;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
    }

    /**
     * This method sorts the array in this class.
     * Can you provide a version that does not affect the array?
     * How would you do that?
     */
    public void selectionSort()
    {     
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) // Ascending order. Change to '>' to have a discending order!
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
     
    public static void main(String a[])
    {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        SelectionSort mySelSort=new SelectionSort(arr1);
        mySelSort.PrintArray();
        
        mySelSort.selectionSort();
        mySelSort.PrintArray();      
    }
}