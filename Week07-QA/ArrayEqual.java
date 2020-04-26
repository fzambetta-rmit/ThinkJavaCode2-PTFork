import java.util.Arrays; 
  
public class ArrayEqual  
{ 
    public static void main(String[] args)  
    { 
        // Let us create different integers arrays 
        int[] arr1 = new int [] {1, 2, 3, 4}; 
        int[] arr2 = new int [] {1, 2, 3, 4}; 
        int[] arr3 = new int [] {1, 2, 4, 3}; 
        int[] arr4 = arr3;
          
        System.out.println("is arr1 equals to arr2 : " + 
                                Arrays.equals(arr1, arr2)); 
        System.out.println("is arr1 equals to arr3 : " + 
                                Arrays.equals(arr1, arr3)); 

        System.out.println("Does arr4 referece the same array as arr3? " + 
                                (arr4==arr3)); 

        System.out.println("Does arr2 referece the same array as arr3? " + 
        (arr2==arr3)); 
    } 
} 