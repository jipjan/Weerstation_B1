
/**
 * Write a description of class AwsApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AwsApp
{
    /**
     * Constructor for objects of class AwsApp
     */
    public AwsApp()
    {
        
    }
    
    public void testDatabaseConnection()
    {
        WeatherStation ws = new WeatherStation();
        
        RawMeasurement rawMeasurement = ws.getMostRecentMeasurement();
        
        System.out.println(rawMeasurement);
    }
}
