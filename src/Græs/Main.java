package Græs;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvor langt er græsset i dag?: ");
        double now = scanner.nextDouble();

        System.out.print("Hvor langt må det maks være?: ");
        double max = scanner.nextDouble();

        Græs græs = new Græs();
        græs.WhenToCut(now, max);

    }
}

