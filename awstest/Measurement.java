
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
    public double getBarometer()
    {
        return measurementsCalculator.luchtdruk(weatherStationData.getMostRecentBarometer());
    }
    
    public double getInsideTemperature()
    {
       return measurementsCalculator.temperatuur(weatherStationData.getMostRecentInsideTemp());
    }
    
    public double getInsideHumidity()
    {
        return measurementsCalculator.luchtVochtigheid(weatherStationData.getMostRecentInsideHum());
    }
    
    public double getOutsideTemperature()
    {
        return measurementsCalculator.temperatuur(weatherStationData.getMostRecentOutsideTemp());
    }
    
    public double getWindSpeed()
    {
        return measurementsCalculator.windSnelheid(weatherStationData.getMostRecentWindSpeed());
    }
    
    public double getAverageWindSpeed()
    {
        return measurementsCalculator.windSnelheid(weatherStationData.getMostRecentAvgWindSpeed());
    }
    
    /* calculator must be fixed first.
    public String getWindDirection()
    {
        return measurementsCalculator.windRichting(weatherStationData.getMostRecentWindDir());
    }*/
    
    public double getOutsideHumidity()
    {
        return measurementsCalculator.luchtVochtigheid(weatherStationData.getMostRecentOutsideHum());
    }
    
    public double getRainRate()
    {
        return measurementsCalculator.regenmeter(weatherStationData.getMostRecentRainRate());
    }
    
    public double getUvLevel()
    {
        return measurementsCalculator.uvIndex(weatherStationData.getMostRecentUVLevel());
    }
    
    public double getSolarRadiation()
    {
        return weatherStationData.getMostRecentSolarRadiation();
    }
    
    public double getBatteryLevel()
    {
        return measurementsCalculator.batterySpanning(weatherStationData.getMostRecentBattLevel());
    }
    
    public String getSunRise()
    {
        return measurementsCalculator.sunRise(weatherStationData.getMostRecentSunrise());
    }
    
    public String getSunSet()
    {
        return measurementsCalculator.sunSet(weatherStationData.getMostRecentSunset());
    }
    
    public String toString()
    {
        return 
        "Barometer: " + getBarometer() + "kpa " +
        "Binnentemperatuur: " + getInsideTemperature() + "C " +
        "Luchtvochtigheid binnen: " + getInsideHumidity() + "% " + 
        "Buitentemperatuur: " + getOutsideTemperature() + "C " + 
        "Windsnelheid: " + getWindSpeed() + "KM/h " +
        "Gemiddelde windsnelheid: " + getAverageWindSpeed() + "KM/h " + 
        "Luchtvochtigheid buiten: " + getOutsideHumidity() + "% "+
        "Regenval: " + getRainRate() + "mm " + 
        "UV level: " + getUvLevel() + " " +
        "Zonnesterkte: " + getSolarRadiation() + "m2 " + 
        "Batterijniveau: " + getBatteryLevel() + "V " + 
        "Zonsopgang: " + getSunRise() + " " +
        "Zonsondergang: " + getSunSet();
    }
    
}
