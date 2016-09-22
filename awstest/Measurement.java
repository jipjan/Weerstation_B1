/**
 * Class with functions that return the current calculated data.
 */
public class Measurement
{
   private WeatherStation W;
   private MetingenHandler M;
   
   public Measurement()
   {
       W = new WeatherStation();
       M = new MetingenHandler();
   }
   
   /**
    * This one is not needed for the assignment.
    */
   public Measurement(String host, String port, String dbName, String userName, String password)
   {
       W = new WeatherStation( host,  port,  dbName,  userName,  password);
       M = new MetingenHandler();
   }
   
   public void setWeatherStation(WeatherStation WS)
   {
       W = WS;
   }
   
   public WeatherStation getWeatherStation()
   {
       return W;
   }

   public double BarometerData()
   {
       return M.luchtdruk(W.getMostRecentBarometer());
   }
   
   public double TemperatuurInsideData()
   {
       return M.temperatuur(W.getMostRecentInsideTemp());
   }
    
   public double LuchtvochtigheidInsideData()
   {
       return M.luchtVochtigheid(W.getMostRecentInsideHum());
   }
   
   public double TemperatuurOutsideData()
   {
       return M.temperatuur(W.getMostRecentOutsideTemp());
   }
   
   public double WindSpeedData()
   {
       return M.windSnelheid(W.getMostRecentWindSpeed());
   }
   
   public double WindSpeedAvData()
   {
       return M.windSnelheid(W.getMostRecentAvgWindSpeed());       
   }
   
   public String WindRichtingData()
   {
       return M.windRichting(W.getMostRecentWindDir());
   }
   
   public double LuchtvochtigheidOutsideData()
   {
       return M.luchtVochtigheid(W.getMostRecentOutsideHum());
   }
   
   public double RainRateData()
   {
       return M.regenmeter(W.getMostRecentRainRate());
   }
   
   public double UVIndexData()
   {
       return M.uvIndex(W.getMostRecentUVLevel());
   }
   
   public double BatteryData()
   {
       return M.batterySpanning(W.getMostRecentBattLevel());
   }
   
   public String SunRiseData()
   {
       return M.sunRise(W.getMostRecentSunrise());
   }
   
   public String SunSetData()
   {
       return M.sunSet(W.getMostRecentSunset());
   }
   

   
   public void PrintAlles()
   {
       System.out.println(
       "Datum: "+
       "\nBarometer: "+BarometerData()+"kPa"+
       "\nBinnentemperatuur: "+TemperatuurInsideData()+"C"+
       "\nBuitentemperatuur: "+TemperatuurOutsideData()+"C"+
       "\nLuchtvochtigheid binnen: "+LuchtvochtigheidInsideData()+"%"+
       "\nLuchtvochtigheid buiten: "+LuchtvochtigheidOutsideData()+"%"+
       "\nWindsnelheid: "+WindSpeedData()+" Km/U"+
       "\nWindrichting: "+WindRichtingData()+
       "\nGevoelstemperatuur: "+
       "\nBatteryspanning: "+BatteryData()+ " Volt"+
       "\nUV index: "+ UVIndexData()+
       "\nZonneStraling: "+
       "\nHeat index: "+
       "\nZonsopgang: "+ SunRiseData()+
       "\nZonsondergang: "+ SunSetData()
       
       );
   }
}
