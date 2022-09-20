package Distance1.Distanceconvertor;
public class DistanceConverter {
    public void meter_to_km(double meter)
    {
        double km=0.001*meter;
        System.out.println("The converted KiloMeter is"+km);
    }
    public void km_to_meter(double km)
    {
        double meter=1000*km;
        System.out.println("The converted meter is"+meter);
    }
    public void miles_to_km(double miles)
    {
        double km=1.60934*miles;
        System.out.println("The converted KiloMeter is"+km);
    }
    public void km_to_miles(double km)
    {
        double miles=0.621371*km;
        System.out.println("The converted Mile is"+miles);
    }
}