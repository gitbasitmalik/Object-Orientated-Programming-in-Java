
package constructorchaining;

public class ConstructorChaining {

    
    public static void main(String[] args) 
    {
         new Test(20, 30);
    }
    
}
class Test
{
    
    public Test()
    {
      this(5);
    }
    public Test(int x)
    {
        this(5,10);
        
    }
    public Test(int x, int y)
    {
        System.out.println(x * y);     
    }
}