package Search;

import java.util.ArrayList;
import java.util.*;

public class MainSearch {
    public static void main(String[] args) throws Exception {

        String[] strings = {"Ella", "Mulan", "Pirat"};


        SearchRepo search = new SearchRepo();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv en streng: ");
        String input = scanner.nextLine();


        search.checkString(strings, input);

        System.out.print("Skriv en ny streng: ");
        String input1 = scanner.nextLine();
        search.checkStringAlternative(strings, input1);



    }

}
