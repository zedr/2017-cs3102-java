package ie.tcd.cs3102;

/**
 * Created by brian on 12/10/2017.
 */
public class Row2 {
    static void printRow(int width) {
        for (int col = 0; col < width; col += 1) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }

    static String rowBody(int width) {
        String s = "";
        for (int col = 0; col < width; col += 1) {
            s += "* ";
        }
        return s;
    }
}
