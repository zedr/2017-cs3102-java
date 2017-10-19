package ie.tcd.cs3102;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        int i = 0; // Initialisation (loop variable)
        int j = 1;
        while (j < 32 || i < 5) {
            // Loop body
            j *= 2;
            i += 1; // Update of loop variable

            //System.out.println("i= "+ i + " j= " + j);
        }

        int k = 0;
        boolean flag = true;
        while (flag && k < 3) {
            flag = !flag;
            //System.out.println("flag= "+ flag + " k= " + k);
        }

        for (int n = 0; n < 10; n += 1) {
            //System.out.println("n=" + n);
        }


        Scanner scan = new Scanner(System.in);
        int x = 1;
/*
        do {
            System.out.print("Enter a number between 1 and 3: ");
            x = scan.nextInt();
        } while (x < 1 || x > 3);

        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("Enter a number between 1 and 3: ");
            x = scan.nextInt();
            if (x >= 1 && x <= 3) {
                keepGoing = false;
            }
        }
*/
        for (int row = 4; row >= 0; row -= 1) {

            int width = (row + 1) * 2;
            for (int col = 0; col < width; col += 1) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        String block = "* * ";
        for ( int row = 0; row < 5; row += 1) {
            System.out.println(block);
            block += "* * ";
            //System.out.format("%x\n", block.hashCode());
        }
    }
}
