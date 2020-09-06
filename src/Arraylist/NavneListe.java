package Arraylist;
import java.util.*;

public class NavneListe {

    private String name;

    public NavneListe()
    {

    }

    public boolean doesArraylistContainString(ArrayList<String> names, String name)
    {
        for(String n : names)
        {
            if(n.equals(name))
            {
                System.out.println("The String has been found");
                return true;
            }

        }

            names.add(name);
            System.out.println(name + " is added");
            return false;

    }

    @Override
    public String toString()
    {
        return "Name: " + name;
    }
}
