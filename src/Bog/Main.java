package Bog;

public class Main {
    public static void main(String[] args) {

        Bog bog = new Bog("1234567891274");
        Bibliotek bibliotek = new Bibliotek();

        bibliotek.CheckISBN(bog);
    }
}
