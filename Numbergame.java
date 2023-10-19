import java.util.Scanner;


public class Numbergame {
  public static void main(String[] args) {
     int answer = 55;
     int k = 4;
     Scanner input = new Scanner(System.in);
     System.out.println("I'm thinking of a number between 1 and 100.\nYou have 4 tries to guess the number.");
   while (k > 0) {
      System.out.println("Enter your guess: ");
     int guess = input.nextInt();
     if (guess == answer) {
        System.out.println("You guessed the number!\nYou win!");
        break;
      }
    else if (guess > answer) {
        System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");
        k--;
      }
    else {
        System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
      }
        k--;
    }
       System.out.println("You ran out of tries!");
    }
  }

