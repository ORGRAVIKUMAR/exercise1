package electricbill;

import java.util.Scanner;

public class Electricbill {
    public static void main(String[] args) {
        
        consumer obj=new consumer();
        obj.getdata();
        obj.bill();
        obj.cbill();
        System.out.println("amount="+obj.bill);
    }
}
class consumer
{
    String name;
    int num;
    int pr;
    int cr;
    String type;
    double bill;
    void getdata()
    {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the details");
        System.out.println("enter the consumer number");
        num=obj.nextInt();
        System.out.println("enter name");
        name=obj.next();
        System.out.println("enter previous month reading");
        pr=obj.nextInt();
        System.out.println("enter current month reading");
        cr=obj.nextInt();
        System.out.println("enter type if 'C' is consumer or 'd' is domestic");
        type=obj.next();
        if(type.equals('c')||type.equals('C'))
        {
            bill();
           
        }
        else
        {
            cbill();
        }
    }
    
    void bill()
    {
    
        if(cr<=100)
        {
        bill=1.50*cr;
        }   
        else if(cr>100&&cr<=200)
        {
        
           bill=(100*1.50)+((cr-100)*3); 
        }
        else if(cr>200&&cr<=500)
        {
        
            bill=(100*1.50)+(100*3)+((cr-300)*4.50);
        }
        else 
        {
        
            bill=(100*1.50)+(100*3)+(300*4.50)+((cr-500)*7);
        }
    }
        
    void cbill()
    {
        if(cr<=100)
        {
        bill=2.50*cr;
        }   
        else if(cr>100&&cr<=200)
        {
        
           bill=(100*2.50)+((cr-100)*5); 
        }
        else if(cr>200&&cr<=500)
        {
        
            bill=(100*2.50)+(100*5)+((cr-200)*6.50);
        }
        else 
        {
       
              
            bill=(100*2.50)+(100*5)+(300*6.50)+((cr-500)*9);  
        }
    }
}