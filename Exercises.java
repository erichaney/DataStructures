import java.util.ArrayList;

class Exercises
{
    static void splitEvensOdds(int[] numbers)
    {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();

        for (int n : numbers)
        {
            if (n % 2 == 0)
            {
                evens.add(n);
            }
            else
            {
                odds.add(n);
            }
        }
        
        System.out.println(evens);
        System.out.println(odds);
    }
    
    static void fibonacci(int n)
    {
        ArrayList<Integer> fibs = new ArrayList<Integer>();
        
        fibs.add(1);
        fibs.add(1);
        
        for (int i = 0; i < n - 2; i++)
        {
            int lastIndex = fibs.size() - 1;
            int lastNumber = fibs.get(lastIndex);
            int secondToLast = fibs.get(lastIndex - 1);
            
            fibs.add(lastNumber + secondToLast);
            
        }
        
        System.out.println(fibs);
    }
    
    static String[] removeDuplicates(String[] words)
    {
        ArrayList<String> noDuplicates = new ArrayList<String>();
        
        for (String w : words)
        {
            if (noDuplicates.contains(w) == false)
            {
                noDuplicates.add(w);
            }
        }
        
        return noDuplicates.toArray(new String[0]); //cast the arraylist to an array.
    }
    
    
}
