import java.util.Scanner;
public class RockPaperScissorsSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rock, Paper, or Scissors: ");
        String userMove = sc.nextLine();
        String[] moves = {"Rock", "Paper", "Scissors"};
        String computerMove = moves[(int) (Math.random() * 3)];
        System.out.println("Computer chose: " + computerMove);
        if (userMove.equalsIgnoreCase(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
