package Arraylist;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        NavneListe liste = new NavneListe();

        ArrayList<String> names = new ArrayList<String>();

            names.add("Christina");
            names.add("Frederik");

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert name: ");
        String name = scan.nextLine();

        liste.doesArraylistContainString(names, name);
        System.out.println(names.toString());



    }
}
