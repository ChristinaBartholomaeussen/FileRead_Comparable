package Græs;

public class Græs {


    double  dage =0;


    public void WhenToCut(double now, double max)
    {
        if(now <= max)
        {
            double diff = max - now;
            dage = (diff/0.8);
            int convertToInt = (int) dage;
            System.out.println("Græsset skal klippes om: " + convertToInt + " dage");
        }
        else
        {
            System.out.println("Græsset er for langt.");
        }

    }
}
