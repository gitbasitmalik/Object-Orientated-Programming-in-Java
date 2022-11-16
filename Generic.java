
package generic;


public class Generic {

    
    public static void main(String[] args) 
    {
        Xyz ob = new Xyz();
        ob.print("Hello", 29.5);
        Abc<String,Integer> ob1 = new Abc<>();
        ob1.method1("Hello", 20);
       
    }
    
}
//Generic Class

class Abc <A,B>
{
    A a;
    B b;
    public void method1(A a, B b)
    {
        System.out.println("HEllo World");
    }
    
}





//Generic Method
class Xyz
{
    public <T,U> void print(T a, U b)
    {
        System.out.println("SLeep!");
    }
}