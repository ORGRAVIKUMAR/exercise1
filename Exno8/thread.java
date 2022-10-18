package simplejavaprogram;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class WordCount extends Thread
{
    String str,filestr="";
    int read,count=0;
    WordCount(String s)
    {
        str=s;
    }
    public void run()
    {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordCount.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while((read=fin.read())!=-1)
            {
                if(read==' ')
                {
                    count++;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(WordCount.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(str+"...."+(count+1));
    }  
    
}
public class thread 
{
    public static void main(String args[])throws IOException
    {
        int n;
        n=args.length;
        WordCount w[]=new WordCount[n];
        for(int i=0;i<n;i++)
        {
            w[i]=new WordCount(args[i]);
            w[i].start();
        }
        
        
        
    }
    
}
