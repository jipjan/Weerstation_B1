

/**
 * Deze class bevat alle methoden voor het omzetten van meetwaarden in Nederlandse eenheden.
 * @author Groep B1
 * @version 1.0
 */
public class MetingenHandler
{
    /**
    * Luchtdruk
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De luchtdruk in mbar
    */
    public static double luchtdruk(short mval) {
        return (mval/100d) * 3.3864d;
    }

    /**
    * Temperatuur
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De temperatuur in graden Celcius
    */
    public static double temperatuur(short mval) {
        return ((mval / 10d) - 32)/1.8d;
    }

    /**
    * Relatieve Luchtvochtigheid
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De relatieve luchtvochtigheid in procenten
    */
    public static double luchtVochtigheid(short mval) {
        return mval;
    }

    /**
    * Windsnelheid
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De windsnelheid in km/h
    */
    public static double windSnelheid(short mval) {
        return (mval * 1.609344d);
    }

    /**
    * Windrichting
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De windrichting in graden
    */
    public static double windRichting(short mval) {
        return mval;
    }

    /**
    * Regenmeter
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De hoeveelheid regen in mm
    */
    public static double regenmeter(short mval) {
        return (mval*0.2);
    }

    /**
    * uvIndex
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De windrichting in graden
    */
    public static double uvIndex(short mval) {
        return (mval/10d);
    }

    /**
    * batterySpanning
    *
    * @param mval   Meetwaarde van het vp2pro weerstation
    * @return De battery spanning in Volt
    */
    public static double batterySpanning(short mval) {
        return (((mval*300d)/512d)/100d);
    }

    /**
    * sunRise
    *
    * @param mval	Meetwaarde van het vp2pro weerstation
    * @return Zonsopkomst in hh:mm notatie
    */
    public static String sunRise(short mval) {
        String toReturn = Short.toString(mval);
        if (toReturn.length() == 3)
            return "0" + toReturn.substring(0,1) + ":" + toReturn.substring(1, 3);
        else
            return toReturn.substring(0,2) + ":" + toReturn.substring(2, 4);
    }

    /**
    * sunSet
    *
    * @param mval	Meetwaarde van het vp2pro weerstation
    * @return Zonsondergang in hh:mm notatie
    */
   public static String sunSet(short mval) {
       return sunRise(mval);
    }
}
