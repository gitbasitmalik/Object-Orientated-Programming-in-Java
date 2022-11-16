
package garbagecollection;

public class GarbageCollection {

    
    public static void main(String[] args) 
    {
        MyClass ob1 = new MyClass();
        MyClass ob2 = new MyClass();
        MyClass ob3 = new MyClass();
        
        ob1 = null;
        ob2 = ob3;
        new MyClass();
       
    }
    
}
class MyClass
{
  
}