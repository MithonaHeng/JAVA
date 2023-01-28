import java.util.*;
import java.io.*;

class ScannerDemo {
   public static void main(String args[])
                      throws FileNotFoundException{

     Scanner sc = new Scanner(new File("myNum.txt"));
     int sum = 0, n;

     while (sc.hasNextInt()) {  
       n = 0;   
        sum = sum + (n=sc.nextInt()) ;     
         System.out.println(n);
     }
     System.out.println("Sum = " + sum);
  }
}