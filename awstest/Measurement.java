
/**
 * Write a description of class Measurement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Measurement
{
    // instance variables - replace the example below with your own
   MetingenHandler measurementsCalculator = new MetingenHandler();
   WeatherStation weatherStationData = new WeatherStation();

    /**
     * Constructor for objects of class Measurment
     */
    public Measurement()
    {
      
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getInsideTemp()
    {
       return measurementsCalculator.temperatuur(weatherStationData.getMostRecentInsideTemp());
    }
}
