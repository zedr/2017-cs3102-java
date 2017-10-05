import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Player 1, choose \"paper\", \"scissors\", \"rock\": ");
        String player1 = scan.next().toLowerCase();
        System.out.println(
                "Player 2, choose \"paper\", \"scissors\", \"rock\": ");
        String player2 = scan.next().toLowerCase();

        switch (player1 + player2) {
            case "rockscissors":
            case "scissorspaper":
            case "paperrock":
                System.out.println("Player 1 wins");
                break;
            case "scissorsrock":
            case "paperscissors":
            case "rockpaper":
                System.out.println("Player 2 wins");
                break;
            case "rockrock":
            case "scissorsscissors":
            case "paperpaper":
                System.out.println("Draw");
                break;
            default:
                System.out.println("Unknown.");
        }
    }
}

