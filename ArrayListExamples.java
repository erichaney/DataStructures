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
    
    static ArrayList<String> createDeck()
    {
        ArrayList<String> cards = new ArrayList<String>();

        String[] suits = {"♠", "♣", "♡", "♢"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K"};

        for (String suit : suits)
        {
            for (String value : values)
            {
                 cards.add(suit + value);
            }
        }
        
        return cards;
    }
}
