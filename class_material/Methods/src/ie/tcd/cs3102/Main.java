package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        for (int row = 0; row < 5; row += 1) {
            int width = (row + 1) * 2;
            //Row2.printRow(width);
            System.out.println(Row2.rowBody(width));
        }
    }
}
