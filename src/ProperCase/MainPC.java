package ProperCase;
import java.util.*;

public class MainPC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv nogle ord: ");
        String input = scanner.nextLine();

        ProperCase propercase = new ProperCase();
        propercase.properCAse(input);

    }
}
