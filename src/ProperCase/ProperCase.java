package ProperCase;

public class ProperCase {

public void properCAse(String sentence)
{
    String[] parts = sentence.split(" ");

    for(String string : parts)
    {
       if(string.equals(string.toUpperCase()))
       {
           System.out.println(string);
       }
       else if(string.length() > 3)
       {
           String out = string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
           System.out.println(out);
       }
       else if(string.length() <= 3)
       {
           String out1 = string.toLowerCase();
           System.out.println(out1);
       }


    }
}








}
