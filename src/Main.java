import java.lang.*;
import java.lang.Math;

class DiffieHellman {

    public static void main (String args[]) {

        double p = 23;
        double g = 5;
        double x = 6;
        double y = 15;

        double a = Math.pow(g, x) % 23;
        double b = Math.pow(g, y) % 23;

        System.out.println("a is:" + a);
        System.out.println("b is:" + b);

        double bx = Math.pow(b, x) % 23;
        double ay = Math.pow(a, y) % 23;

        System.out.println("bx is:" + bx);
        System.out.println("ay is:" + ay);


        double z = bx - ay;
        System.out.println("z is:" + bx);

        if (Math.abs(z) <= 0.000001)
            System.out.print("equal");
        else
            System.out.println("not equal");


    }

}