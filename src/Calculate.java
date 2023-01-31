import java.util.Scanner;;
public class Calculate {
 public static void main(String []args){

 Scanner scan= new Scanner(System.in);
 System.out.println("Enter number:");
  int num=scan.nextInt();
   for(int i=0;i<=num;i++){
       int total=num*i;
       System.out.println(num+"x"+i+"= "+total);
 }
}
}
