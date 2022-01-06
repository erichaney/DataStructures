import java.util.ArrayList;

class ArrayListExamples
{

    static void breakfastMenu()
    {
       ArrayList<String> menu = new ArrayList<String>();
       
       menu.add("Bacon");
       menu.add("Toast");
       menu.add("Pancakes");
       
       for (String m : menu)
       {
           System.out.println(m);
       }
        
       menu.add(0, "Coffee");
       menu.add(2, "OJ");
       
       for (String m : menu)
       {
           System.out.println(m);
       }
    }
    
    static void lottoNumbers()
    {
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++)
        {
            int randomNum = (int) (Math.random() * 100);
            lotto.add(randomNum);
        }
        
        for (int n : lotto)
        {
            System.out.println(n);
        }
    }
}
