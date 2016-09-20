/**
 * Class with functions that return the current calculated data.
 */
public class Measurement
{
   //Dit is een atribuut. 
   private WeatherStation W;
   private MetingenHandler M;
   
   public Measurement()
   {
       W = new WeatherStation();
       M = new MetingenHandler();
   }
   
   //Dit zorgt ervoor dat je er een andere database aan kan linken
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
   
   public String WindRichtingData()
   {
       return M.windRichting(W.getMostRecentWindDir());
   }
   
   public double LuchtvochtigheidOutsideData()
   {
       return M.luchtVochtigheid(W.getMostRecentOutsideHum());
   }
   
   
   
   public void PrintAlles()
   {
       System.out.println(
       "Barometer: "+BarometerData()+"kPa"+
       "\nBinnentemperatuur: "+TemperatuurInsideData()+"C"+
       "\nBuitentemperatuur: "+TemperatuurOutsideData()+"C"+
       "\nLuchtvochtigheid binnen: "+LuchtvochtigheidInsideData()+"%"+
       "\nLuchtvochtigheid buiten: "+LuchtvochtigheidOutsideData()+"%"+
       "\nWindsnelheid: "+WindSpeedData()+" Km/U"+
       "\nWindrichting: "+WindRichtingData()+
       "\n"
       
       );
   }
}
