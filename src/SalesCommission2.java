import java.util.*;

class SalesCommission2 {
   public static void main(String[] args) {

        double commissionRate = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value of sales class (1, 2 or 3):");
        int salesClass = sc.nextInt();

        switch (salesClass){
          case 1:
                 commissionRate = 0.02;
                 break;
          case 2:
                 commissionRate = 0.035;
                 break;
          case 3:
                 commissionRate = 0.05;
                 break;
          default:
                 commissionRate = 0.0;
                 break;
        }

        System.out.printf("Commission Rate he/she got is %.3f", commissionRate);

   }
}