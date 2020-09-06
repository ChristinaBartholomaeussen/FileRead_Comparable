package Search;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class SearchRepo extends Exception{


    public SearchRepo(){}

    public boolean checkString(String[] strings, String string)
    {
        int index = -1;
        for(int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) {
                index = i;
                System.out.println("Strengen er i index: " + index);

                return true;
            }
        }

        System.out.println(index);
        return false;
    }




    public boolean checkStringAlternative(String[] strings, String string)
    {
        int index = -1;
        for(int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) {
                index = i;
                System.out.println("Strengen er i index: " + index);

                return true;
            }
        }
       try{
           throw new Exception("Streng findes ikke");
       }catch(Exception e)
       {
           System.out.println(e);
           return false;
       }

    }







    }



