import java.util.*;

class SalesCommission3 {
   public static void main(String[] args) {

        double commissionRate = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales total(in $) of a sale representative :");
        double salesTotal = sc.nextDouble();

        System.out.println("Enter a value of sales class (1, 2 or 3):");
        int salesClass = sc.nextInt();

        switch (salesClass){
           case 1:
              if (salesTotal < 10000.0)
                 commissionRate = 0.01;
              else
                 commissionRate = 0.02;
              break;
           case 2:
              if (salesTotal < 10000.0)
                 commissionRate = 0.025;
              else
                 commissionRate = 0.035;
              break;
           case 3:
              if (salesTotal < 10000.0)
                 commissionRate = 0.04;
              else
                 commissionRate = 0.05;
              break;
           default:
              commissionRate = 0.0;
              break;
        }
        System.out.printf("Commission Rate he/she got is %.3f\n", commissionRate);
        System.out.printf("He/she got bonus %.2f\n", (commissionRate*salesTotal));
    }
}