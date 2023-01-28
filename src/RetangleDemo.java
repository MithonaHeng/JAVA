import java.util.Scanner;
class RectangleDemo {
   public static void main(String args[]) {
   @SuppressWarnings("resource")
      Scanner myScanner = new Scanner(System.in);
      double width, height;

      System.out.println("Computing Area of a Rectangle.");
      System.out.print("Please, input width : ");
      width = myScanner.nextDouble();
      System.out.print("Please, input height : ");
      height = myScanner.nextDouble();

      System.out.print("Area = " + (width*height));
   }
}

