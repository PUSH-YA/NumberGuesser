import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String args []) {
        Random rand = new Random();
        int upperbound = 100;
         int int_random = rand.nextInt(upperbound); // generate random number from 1-100
         System.out.println("the integer from 0 to " + (upperbound) + " is " + int_random);

        Scanner my_obj = new Scanner(System.in); // create a scanner obj
            System.out.println("Enter your guess from 1 to 100");

            int guess = my_obj.nextInt(); // read user input
        
          my_obj.close();  

        if(guess == int_random){
            System.out.println("Correct :)");
        }else{
            System.out.println("Loser!");

        }
    }
}
