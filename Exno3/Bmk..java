package simplejavaprogram;
import java.util.*;
class banks
{
    public int amount;
    int  getBalance()
    {
        return 0;
    }
}
class bankA extends banks
{
    bankA(int a)
    {
        amount=a;
    }
    int getBalance()
    {
        return amount;
    }
    
}
class bankB extends banks
{
    bankB(int b)
    {
        amount=b;
    }
    int getBalance()
    {
        return amount;
    }
}
class bankC extends banks
{
    bankC(int c)
    {
        amount=c;
    }
    int getBalance()
    {
        return amount;
    }
}
public class Bmk {
    public static void main(String[] args)
    {
        int bamount1,bamount2,bamount3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter bank A,bank B, bank C amount");
        bamount1=s.nextInt();
        bamount2=s.nextInt();
        bamount3=s.nextInt();
        bankA A=new bankA(bamount1);
        bankB B=new bankB(bamount2);
        bankC C=new bankC(bamount3);
        System.out.println("BankA amount is:"+A.getBalance());
        System.out.println("BankB amount is:"+B.getBalance());
        System.out.println("BankC amount is:"+C.getBalance());
    }
    
}
