import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of dice: ");
        int numDice = scanner.nextInt();
        
        System.out.print("Enter the number of sides on each dice: ");
        int numSides = scanner.nextInt();
        
        int total = 0;
        Random random = new Random();
        
        for (int i = 1; i <= numDice; i++) {
            int roll = random.nextInt(numSides) + 1;
            System.out.println("Roll " + i + ": " + roll);
            total += roll;
        }
        
        System.out.println("Total: " + total);
        
        scanner.close();
    }
}
