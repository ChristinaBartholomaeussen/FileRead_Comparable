package Sortering;
import java.util.*;



public class Word{


    public void readWord()
    {
        ArrayList<String> words = new ArrayList<String>();
        for(int i = 1; i <= 5; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ord " + i + ": ");
            String word = scanner.nextLine();
            words.add(word);
        }
        Collections.sort(words, Collections.reverseOrder());
        System.out.println(words);
    }




}
