package Bog;

import java.util.ArrayList;

public class Bibliotek {

    ArrayList<Bog> bøger = new ArrayList<Bog>();
    {
        bøger.add(new Bog("1234567891234", "Haj", 1994));
        bøger.add(new Bog("1234567891235", "Hi", 1995));
        bøger.add(new Bog("1234567891236", "Ohoj", 1996));
    }

    public boolean CheckISBN(Bog bog)
    {
        for(Bog b : bøger)
        {
            if(b.getIsbnNummer().equals(bog.getIsbnNummer()))
            {
                System.out.println("ISBN matcher");
                return true;
            }
        }
        System.out.println("ISBN ikke fundet");
        return false;
    }
}
