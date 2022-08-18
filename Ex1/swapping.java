package ex1;
import java.util.*;
public class swapping {
    public static void main(String[] args)
    {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter your a,b value");
        int a = o.nextInt();
        int b = o.nextInt();
        int temp;
        System.out.println("Before swapping values are");
        System.out.println("a=" + a + "\tb=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping values are a=" + a + "\tb=" + b);
    }
}
    
}
