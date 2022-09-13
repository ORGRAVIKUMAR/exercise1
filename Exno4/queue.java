 /*Define an interface “QueueOperations” which declares methods for a static queue. Define 
a  class  “MyQueue”  which  contains  an  array  and  front  and  rear  as  data  members  and 
implements the above interface. Initialize the queue using a constructor. Write the code to 
perform operations on a queue objecpackage simplejavaprogram;
*/
package ex1;
import java.util.*;
interface queueoperations
{
    public void enqueue(int b);
    public void dequeue();
    public void display();
    public void peek();
}
class Myqueue implements queueoperations
{
    int i;
    int queue[];
    int arr_size;
    int rear;
    int front;
    int data;
    Myqueue(int size)
    {
        arr_size=size;
        queue=new int[arr_size];
        rear=-1;
        front=0;
    }
    public void enqueue(int b)
    {
        data=b;
        if(rear==arr_size-1)
        {
            System.out.println("overflow");
        }
        else
        {
        rear=rear+1;
        queue[rear]=data;
        }
    }
    public void dequeue()
    {
        if(front==arr_size)
        {
            System.out.println("underflow");
        }
        else
        {
        System.out.println(queue[front]);
        front++;
        }
    }
    public void display()
    {
        for(i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public void peek()
    {
        System.out.println(queue[front]);
    }
}
public class queue {
    public static void main(String args[])
    {
        int ch,n,a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your array size");
        n=s.nextInt();
        Myqueue obj=new Myqueue(n);
        do
        {
            System.out.println("Enter your choice");
            ch=s.nextInt();
            
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter your data");
                    a=s.nextInt();
                    obj.enqueue(a);
                    break;
                }
                case 2:
                {
                    obj.dequeue();
                    break;
                }
                case 3:
                {
                    obj.display();
                    break;
                }
                case 4:
                {
                    obj.peek();
                    break;
                }
                default:
                    System.exit(0);
            }
        }while(ch!=5);
    } 
}
