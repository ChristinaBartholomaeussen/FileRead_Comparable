package Kvadrat;

public class Kvadrat {

    public void UdskrivKvadrat(int heltal)
    {
        for(int i = 1; i <= heltal; i++)
        {
            for (int j = 1; j <= heltal; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void UdskrivSpecifikKarakter(String symbol, int heltal)
    {
        for(int i = 1; i <= heltal; i++)
        {
            for(int j = 1; j <= heltal; j++)
            {
                System.out.print(" " + symbol);
            }
            System.out.println();
        }
    }
}
