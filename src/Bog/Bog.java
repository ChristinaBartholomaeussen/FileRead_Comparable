package Bog;

public class Bog {

    private String isbnNummer;
    private String titel;
    private int aar;

    public String getIsbnNummer() {
        return isbnNummer;
    }

    public String getTitel() {
        return titel;
    }

    public int getAar() {
        return aar;
    }

    public void setIsbnNummer(String isbnNummer) {
        this.isbnNummer = isbnNummer;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    public Bog(String isbnNummer, String titel, int aar)
    {
        this.isbnNummer = isbnNummer;
        this.titel = titel;
        this.aar = aar;
    }

    public Bog(String isbnNummer)
    {
        this.isbnNummer = isbnNummer;

    }

    @Override
    public String toString()
    {
        return "" + isbnNummer;
    }
}
