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
}
