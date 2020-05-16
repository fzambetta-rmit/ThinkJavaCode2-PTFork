public class Exercise6 
{
    public static boolean isAbecedarian(String str) 
    {
        String s = str.toLowerCase();
		int index = 0;
        char c = 'a'; 
        
        while (index < s.length()) 
        {
            if (c > s.charAt(index)) 
            {
				return false;
			}
			c = s.charAt(index); 
			index = index + 1;
			
		}
		return true;
    }
    
    public static void main(String args[])
    {
        // Try for instance beknow, bijoux, biopsy
        // Feel free to try out different words...
        System.out.println(isAbecedarian("bent"));
        System.out.println(isAbecedarian("blue"));

        System.out.println(isAbecedarian("CoSt"));
        System.out.println(isAbecedarian("runner"));
        
        System.out.println(isAbecedarian("bios"));
        System.out.println(isAbecedarian("test"));
    }

}