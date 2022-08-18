package ex1;
import java.util.*;
public class sumofintegersdivisibleby7 {
    public static void main(String[] args)
    {
    Scanner o = new Scanner(System.in);
    System.out.println("Enter your lower and upper bound");
    int low_bound = o.nextInt();
    int upr_bound = o.nextInt();
    int sum = 0;
    for (int i = low_bound; i < upr_bound; ++i) {
        if (i % 7 == 0) {
            sum += i;
        }
           
    }
    System.out.println("Sum between given no.s that are divisble by 7 is:\t" + sum);
    }
}    
}
