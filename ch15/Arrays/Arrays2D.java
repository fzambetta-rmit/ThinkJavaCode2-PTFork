package Arrays;

public class Arrays2D 
{ 
    private int[][] intTable = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
    private double[][] doubleTable = { { 1.1, 2.2, 3.3 }, { 4.4, 5.5, 6.6 }, { 7.7, 8.8, 9.9 } }; 
    private String stringTable[][] = { {"Apple", "Banana"}, {"Cheesecake", "Black Forest", "Panettone"} };

    private void printIntArray()
    {
        for (int i = 0; i < intTable.length; i++) 
            for (int j = 0; j < intTable[i].length; j++) 
                System.out.println("Table[" + i + "][" + j + "] = "
                                   + intTable[i][j]); 
    }

    private void printDoubleArray()
    {
        for (int i = 0; i < doubleTable.length; i++) 
            for (int j = 0; j < doubleTable[i].length; j++) 
                System.out.println("Table[" + i + "][" + j + "] = "
                                   + doubleTable[i][j]); 
    }

    private void printStringArray()
    {
        for (int i = 0; i < stringTable.length; i++) 
            for (int j = 0; j < stringTable[i].length; j++) 
                System.out.println("Table[" + i + "][" + j + "] = "
                                   + stringTable[i][j]); 
    }

    public static void main(String[] args) 
    { 
        Arrays2D a2d = new Arrays2D();

        a2d.printIntArray();
        System.out.println("*******");
        a2d.printDoubleArray();
        System.out.println("*******");
        a2d.printStringArray();
    } 
} 