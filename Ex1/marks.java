package ex1;
import java.util.*;
public class marks
{
    public static void main(String[] args) 
    {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = o.nextInt();
        switch (marks) {
            case 10: {
                System.out.println("Excellent");
                break;
            }
            case 9: {
                System.out.println("Very good");
                break;
            }
            case 8: {
                System.out.println("Very good");
                break;
            }
            case 7: {
                System.out.println("good");
                break;
            }
            case 6: {
                System.out.println("GOod");
                break;
            }
            case 5: {
                System.out.println("poor");
                break;
            }
            case 4: {
                System.out.println("poor");
                break;
            }
            case 3: {
                System.out.println("Poor");
                break;
            }
            case 2: {
                System.out.println("Very poor");
                break;
            }
            case 1: {
                System.out.println("Very poor");
                break;
            }
            case 0: {
                System.out.println("Very poor");
                break;
            }
            default:{
                System.out.println("Please Enter the valid mark");                
            }
        }
    }
}    
}
