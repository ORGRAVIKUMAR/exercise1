package Distance1;
import Distance1.Distanceconvertor.DistanceConverter;
import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
        DistanceConverter ds=new DistanceConverter();
        Scanner sc=new Scanner(System.in);
        System.out.println("Distance Convertor");
        int ch=0;
        double me,km,mi;
        do
        {
            System.out.println("1.Meter-Km 2.Km-Meter 3.Mile-Km 4.Km-Mile 5.Exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
                System.out.println("Enter Meter:");
                me=sc.nextInt();
                ds.meter_to_km(me);
                break;
            case 2:
                System.out.println("Enter Km:");
                km=sc.nextInt();
                ds.km_to_meter(km);
                break;
            case 3:
                System.out.println("Enter Mile:");
                mi=sc.nextInt();
                ds.miles_to_km(mi);
                break;
            case 4:
                System.out.println("Enter Km:");
                km=sc.nextInt();
                ds.km_to_miles(km);
                break;
            case 5:
                System.exit(0);
            }
        }
        while(ch<5);
    }
} 