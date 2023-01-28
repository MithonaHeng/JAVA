public class Area {
    // Compute the area of a circle
       public static void main(String args[]){
          float pi, r, a;
    
          r = 10.8f;      // radius of circle
          pi = 3.1416f;      // pi, approximately
          a = pi * r * r;    // compute area
        
          System.out.println("Area of circle is " + a);
          System.out.printf("%.2f", a);
       }  
    }
