package ex1;
import java.util.*;
public class smallestandlargestelementinarray {
public static void mainn(String[] args) 
{
        Scanner o = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter your array of 10 elements");
        for (int i = 0; i < a.length; ++i) {
            a[i] = o.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Smallest element in array:\t" + min);
        System.out.println("Largest element in array:\t" + max);
    }
}
}
}
