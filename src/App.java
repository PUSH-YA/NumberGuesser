import java.util.Random;
import java.util.Scanner;

public class App {
    
    
    
    public static void numberGuesser(){

        Random rand = new Random();
        int upperbound = 100;
        int counter = 1;
        int old_guess = 0;

         int int_random = rand.nextInt(upperbound); // generate random number from 1-100
         //System.out.println("the integer from 0 to " + (upperbound) + " is " + int_random); // to test

        Scanner my_obj = new Scanner(System.in); // create a scanner obj
            System.out.println("Guess the numebr from 1 to 100:");

            int guess = my_obj.nextInt(); // read user input

        while(counter < 10) // number of tries
        {

            if(guess == old_guess){
                System.out.println("That is the same number, take the game seriously >:(");
                my_obj.close();
                break;
            }
            else if (guess == int_random){
                System.out.println("Nice, guessed the correct number ;)");
                my_obj.close();
                break;
              } 
                
              else if(guess > int_random){
                System.out.println("number is too high :(, this was your try " + counter + ", guess again");
                old_guess = guess;
                guess = my_obj.nextInt();
                counter ++;
            } 
            else{
                System.out.println("number is too low :(, this was your try " + counter + ", guess again");
                old_guess = guess;
                guess = my_obj.nextInt();
                counter ++;
    
            }
            my_obj.close();
        }
        if(counter > 10){
            System.out.println("you took" + counter + " guesses, you must be trolling >:(");
            
        }
        
          

    }
    
    
    public static void main( String args []) {
        //function call
        numberGuesser();
    }
}