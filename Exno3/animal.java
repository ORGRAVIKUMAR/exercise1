package Ex1;
class anim
{
    private String own_name;
    public String ani_name;
    anim(String a)
    {
        ani_name=a;
    }
    public String toString()
    {
        return "animal name is"+ani_name;
    }    
}
class mammal extends anim
{
    public String mam_name;
    mammal(String a,String b)
    {
        super(a);
        ani_name=a;
        mam_name=b;
    }
    public String toString()
    {
        return "animal name is"+ani_name+"and its mammal name is"+mam_name;
    }
}
class cat extends mammal
{ 
    
    cat(String a,String b,String c)
    {
        super(b,c);
        cat_name=a;
        ani_name=b;
        mam_name=c;
    }
    
    public String cat_name;
    void greets()
    {
        System.out.println("Cat sound is Meow");
    }
    public String toString()
    {
        return "cat name is\t"+cat_name+"\t\tand its mammal name is\t"+mam_name+"\t\tand its animal name is\t"+ani_name;
    }
}
class dog extends mammal
{ 
    public String dog_name,adog_name;
    
    dog(String a,String b,String c,String d)
    {
        super(b,c);
        dog_name=a;
        mam_name=b;
        ani_name=c;
        adog_name=d;
    }
    void greets()
    {
        System.out.println("one dog souund is Wooh");
    }
    void greetsano_dog()
    {
        System.out.println("Another dog sound is Woooh");
    }
    public String toString()
    {
        return "\ndogname is\t"+dog_name+"\tand its mammal name is\t"+mam_name+"\tand its animal name is\t"+ani_name+"\n\n"+"anodognam is\t"+adog_name+"\t\tanother mammal name is\t"+mam_name+"\tanother animal name is\t"+ani_name+"\n\n";
    }
    
}
        
public class animal {
    public static void main(String[] args)
    {
        cat c=new cat("meoth","pneumotodes","mammoth");
        dog d=new dog("Dobberman","Labrador","rajapalay","cheems");
        System.out.println(c);
        System.out.println(d);
        c.greets();
        d.greets();
        d.greetsano_dog();
        
    }
    
}
