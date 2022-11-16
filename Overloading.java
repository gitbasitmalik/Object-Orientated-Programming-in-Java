
package overloading;


public class Overloading {

   
    public static void main(String[] args) 
    {
//        ClassA ob = new ClassA();
//        System.out.println("sum = "+ ob.sum(20, 30, 40));
//        System.out.println("sum = "+ ob.sum(10, 20, 30, 50));
//        System.out.println("sum = "+ ob.sum(10, 20, 30));
    }
    
}
class ClassA
{
    
        public int sum(int x, int y)
        {
            return (x+y);
        }
        public int sum(int x, int y, int z)
        {
            return (x+y+z);
        }
        public int sum(int a, int x, int y , int z)
        {
            return (a+x+y+z);
        }
}
class ClassB extends ClassA
{
    @Override
        public int sum(int x, int y)
        {
            return (x+y);
        }
    @Override
        public int sum(int x, int y, int z)
        {
            return (x+y+z);
        }
    @Override
        public int sum(int a, int x, int y , int z)
        {
            return (a+x+y+z);
        }
}