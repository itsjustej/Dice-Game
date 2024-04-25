import java.util.Random;
import java.util.Scanner;

public class Game {
    private Random rand = new Random();
    private Scanner scan = new Scanner(System.in);
    private int numDice; // Assuming this is a member variable of the Game class
    private int trials;  // Assuming this is a member variable of the Game class

    // Constructor for initializing numDice and trials
    public Game(int numDice, int trials) {
        this.numDice = numDice;
        this.trials = trials;
    }

    public int play(String who, int targetNumber) {
        int[] dice = new int[numDice];
        int points = 0;

        for (int i = 0; i < trials; i++) {
            for (int j = 0; j < numDice; j++) {
                dice[j] = rand.nextInt(6) + 1; // 1 to 6
            }
        }

        System.out.println("Press Enter");
        scan.nextLine();

        for (int j : dice) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (int j = 0; j < numDice; j++) {
            if (dice[j] == targetNumber) {
                points++;
            }
        }

        System.out.println(who + " got " + points + " points");
        return points;
    }
}
