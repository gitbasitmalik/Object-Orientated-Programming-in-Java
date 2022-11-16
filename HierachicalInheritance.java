
package hierachicalinheritance;


public class HierachicalInheritance
{

    public static void main(String[] args) 
    {
        
    }
    
}
class A
{
    public void method1()
    {
        System.out.println("i am class A");
    }
}
class B extends A
{
    public void method2()
    {
        System.out.println("we are class A and B");
    }
    
}
class E extends B
{
    public void method3()
    {
        System.out.println("we are class A,B and E");
    }
}
class C extends A
{
     public void method4()
    {
        System.out.println("we are class A and C");
    }
}
class D extends C
{
     public void method5()
    {
        System.out.println("we are class A,C and D");
    }
}
class F extends E
{
     public void method6()
    {
        System.out.println("we are class A,B,E and F");
    }
}
class G extends C
{
     public void method7()
    {
        System.out.println("we are class A,C and G");
    }
}