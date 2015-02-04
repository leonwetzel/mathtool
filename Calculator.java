
/**
 * A tool to calculate the slope of a quadratic formula.
 * Application is written in English, but meant for Dutch users.
 * This project is build in BlueJ.
 * 
 * Feel free to use this tool! 
 * 
 * @author Leon Wetzel
 * @version 04.02.2015
 */
public class Calculator
{
    // instantievariabelen
    private String eindresultaat;

    /**
     * Constructor for objects of class Calculator
     * @param grondgetal
     * @param macht
     */
    public Calculator(double grondgetal, double macht)
    {
        bereken(grondgetal, macht);
        System.out.println(eindresultaat);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  grondgetal
     * @param  macht
     * @return Antwoord
     */
    public String bereken(double grondgetal, double macht)
    {
        // The formula for calculating the slope of a quadratic formula: n*x^(n-1)
        double nieuwTal = grondgetal * macht;
        double nieuwMacht = macht-1.00;
        eindresultaat = "De afgeleide van " + grondgetal + "x^" + macht + " is " + nieuwTal + "x^" + nieuwMacht + ".";
        return eindresultaat;
    }
}
