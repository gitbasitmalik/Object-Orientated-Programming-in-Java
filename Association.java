
package association;


public class Association 
{

    public static void main(String[] args) 
    {
        NewClassB obj1 = new NewClassB();
        NewClassA obj = new NewClassA(obj1);
        
        obj = null;
        System.gc();
    }
}
class NewClassA 
{
    NewClassB obj ;
    int a;
    double b;
   
   public NewClassA(NewClassB o)
   {
       obj = o;
   }
    public void finalize()
    {
        System.out.println("NewClassA oject Destroyed");
    }
}
  
class NewClassB 
{   
     public void finalize()
    {
        System.out.println("NewClassB oject Destroyed");
    }
}

