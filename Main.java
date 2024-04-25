// import static org.junit.jupiter.api.Assertions.assertEquals;

// Imports

import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

//Game of 3 Dice Objectives

System.out.println("Choose a number 1-6");
System.out.println("Throw 3 dice");
System.out.println("Count the number of occurences of your chosen number");
System.out.println("Computer does the same and repeats");
System.out.println("Whoever gets the most of the chosen number wins the game");
System.out.println();

// initializing starting values
    int numDice = 3, trials = 5, playerPoints = 0, computerPoints = 0;
    Random choice = new Random();
    Scanner scan = new Scanner(System.in);

// Letting the User Choose a number
    System.out.println("Pick your number: ");
    int playerNum = scan.nextInt();
    Game player = new Game(numDice, trials);
    playerPoints = player.play("Player", playerNum);

// Computer chooses a number
    int computerNum = choice.nextInt(6) + 1;
    System.out.println("Computer's number is: " + computerNum);
    Game computer = new Game(numDice, trials);
    computerPoints = computer.play("Computer", computerNum);

  // Game End
    if (playerPoints > computerPoints){
      System.out.println("You Win!");
    }else if (playerPoints < computerPoints){
      System.out.println("You Lose!");
    }else{
      System.out.print("It's a tie");
      scan.close();
    }
    
    
    


  
    


  }
}