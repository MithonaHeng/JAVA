import java.util.Random;
import java.util.Scanner;

public class RandomGame{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Input number between 1 to 6:");
        id = sc.nextInt();
        Random random = new Random();
        int x = random.nextInt(6)+1;
        if(id == x){
            System.out.println("Congratulation! you won");
        }
        else if(id < 1 && id > 6){
            System.out.println("Goodbye");
        }
        else{
            System.out.println("Sorry, you lost. The number is "+x);
        }
    }
}
