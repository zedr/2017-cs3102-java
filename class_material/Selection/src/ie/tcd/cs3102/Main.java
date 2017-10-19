package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int n = 10;
        int m = 20;

        // Branching
        if (n >= 10 && m <= 20) {
            System.out.println("if part is executed");
        } else {
            System.out.println("else part is executed");
        }

        if (n >= 0) {
            if (m > 10) {
                System.out.println("n > 0 and m > 10");
            } else {
                System.out.println("n > 0 and m > 10");
            }
        }

        // Ternary statement

        int q = (n > 0) ? 10 : 20;

        if (n > 0) {
            q = 10;
        } else {
            q = 20;
        }

        final double EPSILON = 1E-14;

        double r = Math.sqrt(2.0);
        System.out.println(r * r);

        if (r * r - 2.0 < EPSILON) {
            System.out.println("Squared is 2!");
        } else {
            System.out.println("Oooops!");
        }

        // Switch statement

        String a = "hello";
        int b = 1;

        switch(a) {
            case "hello":
            case "world":
                System.out.println("Matches hello or world");
                break;
            case "joe":
                System.out.println("Matches 2");
                break;
            case "bloggs":
                System.out.println("Matches 3");
                break;
            default:
                switch(b) {
                    case 1:
                        System.out.println("One");
                    default:
                        System.out.println("None");
                }
                System.out.println("Matches none!");
        }

        /*
        if (a == 1 || a == 5) {

        } else if (a == 2) {

        } else if (a == 3) {

        } else {

        }
        */

        //
    }
}
