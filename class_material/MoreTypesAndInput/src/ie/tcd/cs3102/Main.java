package ie.tcd.cs3102;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int tries = 1;
        while (tries < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int first = scanner.nextInt();
            System.out.print("Enter second number: ");
            int second = scanner.nextInt();
            System.out.println("The smaller of these is: " +
                    Math.min(first, second));
            tries += 1;
        }

        /*

        // Strings
        String name = "John Doe";
        System.out.println(name.length());
        String age = "40 years of age";

        // Concatenation (combining strings)
        System.out.println(name + " is " + age);

        System.out.print("This is a new line \n");
        System.out.print("This is a tab \t character \n");

        String greeting = "Hello, world";
        System.out.println(greeting.substring(7));
        System.out.println(greeting.substring(0, 5));

        System.out.println("A couple of words".indexOf("words"));

        String player1 = "rock", player2 = "paper";

        if (player1.compareTo(player2) == 0) {
            System.out.println("A tie");
        }
        switch (player1) {
            case "rock":
                switch (player2) {
                    case "scissors":

                        break;
                    case "paper":

                        break;

                }
                break;
            case "scissors":
                switch (player2) {
                    case "rock":

                        break;
                    case "paper":

                        break;

                }
                break;
            case "paper":
                switch (player2) {
                    case "rock":

                        break;
                    case "scissors":

                        break;

                }
                break;
        }

        if (player1.compareTo("rock") == 0) {
            if (player2.compareTo("rock") == 0) {

            } else if (player2.compareTo("scissors") == 0) {

            } else if (player2.compareTo("paper") == 0) {

            }
        } else if (player1.compareTo("scissors") == 0) {
            if (player2.compareTo("rock") == 0) {

            } else if (player2.compareTo("scissors") == 0) {

            } else if (player2.compareTo("paper") == 0) {

            }
        } else if (player1.compareTo("paper") == 0) {
            if (player2.compareTo("rock") == 0) {

            } else if (player2.compareTo("scissors") == 0) {

            } else if (player2.compareTo("paper") == 0) {

            }
        }

        */
    }
}
