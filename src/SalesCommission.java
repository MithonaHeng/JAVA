import java.util.*;
class SalesCommission {
   public static void main(String[] args) {

        double commissionRate = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales total(in $) of a sale representative :");
        double salesTotal = sc.nextDouble();

        System.out.println("Enter a value of sales class (1 or 2):");
        int salesClass = sc.nextInt();

        if (salesClass < 1 || salesClass > 2)
           return;

        if (salesClass == 1)
           if (salesTotal < 10000.0)
              commissionRate = 0.02;
           else
              commissionRate = 0.04;

        else if (salesClass == 2)
           if (salesTotal < 10000.0)
              commissionRate = 0.025;
           else
              commissionRate = 0.05;

        System.out.printf("Commission Rate he/she got is %.2f", commissionRate);
        System.out.printf("\nHe/she got bonus = %.2f $", commissionRate*salesTotal);
   }
}