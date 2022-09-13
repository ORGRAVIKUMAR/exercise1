
package simplejavaprogram;
import java.util.*;
abstract class Mark
{
   abstract float getPercentage();   
}
class A extends Mark
{
    int mark1,mark2,mark3,tot_mark,tot_sub=3;
    float per;
    A(int m1,int m2,int m3)
    {
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    float getPercentage()
    {
        tot_mark=mark1+mark2+mark3;
        per=(tot_mark/tot_sub);
        return per;
    }
}
class B extends Mark
{
    int mark1,mark2,mark3,mark4,tot_mark;
    float per;
    int tot_sub=4;
    B(int r,int s,int t,int u)
    {
        mark1=r;
        mark2=s;
        mark3=t;
        mark4=u;
    }
    float getPercentage()
    {
        tot_mark=mark1+mark2+mark3;
        per=(tot_mark/tot_sub);
        return per;
    }
    
}
public class student {
public static void main(String[] args){
        int s1m1,s1m2,s1m3,s2m1,s2m2,s2m3,s2m4;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your marks for student A:");
        s1m1=s.nextInt();
        s1m2=s.nextInt();
        s1m3=s.nextInt();
        A obj=new A(s1m1,s1m2,s1m3);
        System.out.println("Enter your marks for Student B:");
        s2m1=s.nextInt();
        s2m2=s.nextInt();
        s2m3=s.nextInt();
        s2m4=s.nextInt();
        B obj1=new B(s2m1,s2m2,s2m3,s2m4);
        System.out.println("Percentage of student A is:"+obj.getPercentage());
        System.out.println("Percentage of student B is"+obj1.getPercentage());  
    }
    
}
