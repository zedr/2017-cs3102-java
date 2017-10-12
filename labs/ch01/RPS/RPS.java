import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Player 1, choose \"paper\", \"scissors\", \"rock\": ");
        String player1 = scan.next().toLowerCase();
        System.out.println(
                "Player 2, choose \"paper\", \"scissors\", \"rock\": ");
        String player2 = scan.next().toLowerCase();

        switch (player1 + player2) {
            case "rock" + "scissors":
            case "scissors" + "paper":
            case "paper" + "rock":
                System.out.println("Player 1 wins");
                break;
            case "scissors" + "rock":
            case "paper" + "scissors":
            case "rock" + "paper":
                System.out.println("Player 2 wins");
                break;
            case "rock" + "rock":
            case "scissors" + "scissors":
            case "paper" + "paper":
                System.out.println("Draw");
                break;
            default:
                System.out.println("Unknown.");
        }
    }
}

