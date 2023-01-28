 // Demonstrate toDegrees() and toRadians().
import java.lang.Math;
public class Angles {
    public static void main(String args[]) {
       double theta = 120.0;
       System.out.print(theta);
       System.out.printf(" degrees is %.2f",
                          Math.toRadians(theta));
       System.out.println(" radians.");
       theta = 1.312;
       System.out.print(theta);
       System.out.printf(" radians is %.2f",
                          Math.toDegrees(theta)); 
       System.out.println(" degrees.");
       System.out.println(Math.sin(Math.toRadians(90.0)));
    }
 }
 
