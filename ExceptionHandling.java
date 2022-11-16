
package exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;
        
public class ExceptionHandling 
{
    
//   InputMismatchException
    public static void main(String[] args) 
    {
        //   InputMismatchException
        int a =100;
        int b = 0;
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        try
        {
           
           int  x = in.nextInt();
            System.out.println(a/b);
            
        }
        catch (InputMismatchException e) {

        System.out.print("invalid number");

     }
       catch(ArithmeticException e)
        {
            System.out.println("cant divided by zero");
            
        }
       
    }
     
       
    
}
