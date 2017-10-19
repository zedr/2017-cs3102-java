package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        int i = 0; // Declaration and assignment in the same statement

        long l; // Longs have a range of -2^63 to 2^63 - 1
        l = 0L; // Note the L suffix is required here

        short s; // Shorts have a range of -2^15 to 2^15 - 1
        s = 0;

        float f;
        f = 0.0f; // Note the f suffix is required here

        double d;
        d = 0.0;

        byte b;
        b = 127; // Bytes have a range of -2^7 to 2^7 - 1
        b = -128;
        b = 0x10;


        char c;
        c = 'A';
        c = 100;
        c = 0x1000;

        int x = 10;
        int y = 20;
        int z = x - y * 100 + 45 / 5 % 10;
        int w = 10 % 3;
        //System.out.println(w);

        double p = 10.0001;
        double q = 20.0002;
        double r = p * q;
        //System.out.println(r);

        int k = (int)(p * q);
        //System.out.println(k);


        boolean flag;
        flag = false;

        // Logical AND
        boolean and = true && flag;
        System.out.println(and);

        // Logical OR
        boolean or = false || flag;
        System.out.println(or);

        // Logical NOT
        boolean not = !flag;
        System.out.println(not);

        boolean lower = 5 > 10;
        System.out.println(lower);

        System.out.println(a + ", " + b);
    }
}
