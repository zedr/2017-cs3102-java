package ie.tcd.cs3102;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
	    // write your code here
        int a = 0;

        int size = 10;
        int[] myNumbers = new int[size];

        myNumbers[0] = 1;
        myNumbers[1] = 2;
        myNumbers[2] = 3;
        myNumbers[9] = 10;

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (char c: vowels) {
            //System.out.println(c);
        }

        String[] myNames = new String[]{
          "Tom",
          "Dick",
          "Harriet"
        };

        int[][] matrix = new int[10][10];
        int v1[] = new int[]{1, 2, 3};
        matrix[0] = v1;
        for (int row = 0; row < matrix.length; row += 1) {
            //printIntArray(matrix[row]);
        }

        //printIntArray(myNumbers);
        //printStringArray(myNames);

        ArrayList<Integer> listOfInts= new ArrayList<>();
        listOfInts.add(20);
        listOfInts.add(1, 10);
        listOfInts.remove(1);
        for (int i = 1; i < 10; i += 1) {
            listOfInts.add(i * i);
        }
        listOfInts.remove(listOfInts.indexOf(64));
        //System.out.println(listOfInts);

        ArrayList<String> listOfNames = new ArrayList<>();

        listOfNames.add("Tom");
        listOfNames.add("Dick");
        listOfNames.add("Harriet");
        listOfNames.add("Tom");

        while(listOfNames.contains("Tom")) {
            listOfNames.remove("Tom");
        }

        //System.out.println(listOfNames);
        for (String name: listOfNames) {
            System.out.printf("%s\n", name);
        }
        //System.out.printf("$%.2f\n", 100000.454795795873);

        for (int k = 0; k < 1000000; k++) {
            int r = (int) (Math.random() * 45 + 1);
            if (r < 1 || r > 45) {
                throw new Exception("Out of range " + r);
            }
        }
        System.out.println("Done!");
    }

    static void printIntArray(int[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i += 1) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]\n");
    }

    static void printStringArray(String[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i += 1) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]\n");
    }
}
