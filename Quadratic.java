
/**
 * A tool to calculate the slope of a quadratic equation.
 * Application is written in English, but meant for Dutch users.
 * This project is build in BlueJ.
 * 
 * Feel free to use this tool! 
 * 
 * @author Leon Wetzel
 * @version 04.02.2015
 */
public class Quadratic
{
    // instantievariabelen
    private String eindresultaat;

    /**
     * Calculate the slope of a quadratic equation
     * @param grondgetal
     * @param macht
     */
    public Quadratic(double grondgetal, double macht)
    {
        bereken(grondgetal, macht);
        System.out.println(eindresultaat);
    }

    /**
     * The calculator
     * 
     * @param  grondgetal
     * @param  macht
     * @return Antwoord
     */
    public String bereken(double grondgetal, double macht)
    {
        // The equation for calculating the slope of a quadratic equation: n*x^(n-1)
        double nieuwTal = grondgetal * macht;
        double nieuwMacht = macht-1.00;
        eindresultaat = "De afgeleide van " + grondgetal + "x^" + macht + " is " + nieuwTal + "x^" + nieuwMacht + ".";
        return eindresultaat;
    }
}
