import static java.lang.Math.*;
   
   // Demonstrate dynamic initialization.
   class DynInit {
      public static void main(String args[]){
     double  a = 3.0,  b = 4.0;

     // c is dynamically initialized
     double c = sqrt(a * a + b * b);           

     System.out.println("Hypotenuse is " + c);
      }
   }