package Kvadrat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvilket symbol vil du udskrive?: ");
        String symbol = scanner.nextLine();

        System.out.print("Hvor mange vil du udskrive?: ");
        int  heltal = scanner.nextInt();

        Kvadrat kvadrat = new Kvadrat();
        kvadrat.UdskrivSpecifikKarakter(symbol, heltal);


    }
}
