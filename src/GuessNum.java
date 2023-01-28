import java.util.Scanner;

class GuessNum {
    // main method begins execution of Java application
    public static void main( String args[] ){

       // create Scanner to obtain input from command window
       @SuppressWarnings("resource")
       Scanner input = new Scanner( System.in );            

       int num;    
       int guessnumber=12; 
       System.out.print("Enter a number between 1 to 100.\n");
       num = input.nextInt(); // read a number from user
  
       if (num == guessnumber) {
          System.out.println("Congratulations! You won.");
          System.out.println("Good luck. Have a nice day!"); 
          return;
       } else if ( num < guessnumber)
          System.out.println("It is too low.");
       else if ( num > guessnumber)
          System.out.println("It is too high.");
       System.out.println("Sorry! You lost.");
     } // end method main
} // end class GuessNum