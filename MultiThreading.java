
package multithreading;


public class MultiThreading {

   
    public static void main(String[] args) 
    {
        MyThread ob = new MyThread();
        MyThread ob1 = new MyThread();
//        MyThread2 ob2 = new MyThread2();
        ob.start();
        ob1.start();
//        ob2.start();
       
        
    }
    
}

class MyThread extends Thread
        
{ 
    public void run()
    {
        for (int i=0; i<= 10;i++)
        {
            System.out.println("Roll No. "+i);
            try
            {
              Thread.sleep(250);  
            }
            catch(Exception ex)
                    {
                        System.out.println("Error aa gya hai bahi");
                    }
        }
    }
}
//class MyThread2 extends Thread
//        
//   { @Override
//    public void run()
//    {
//        for (int j=0; j<= 10;j++)
//        {
//            System.out.println("student Roll number. "+j);
//            try
//            {
//              Thread.sleep(300);  
//            }
//            catch(Exception a)
//                    {
//                        System.out.println("Error aa gya hai bahi");
//                    }
//        }
//    }
//   }