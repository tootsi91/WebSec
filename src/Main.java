import java.lang.*;
import java.math.BigInteger;

class DiffieHellman {

    public static void main (String args[]) {

        BigInteger p = BigInteger.valueOf(23);
        BigInteger g = BigInteger.valueOf(5);
        BigInteger x = BigInteger.valueOf(979997000);
        BigInteger y = BigInteger.valueOf(76575000);
        
        BigInteger a = g.modPow(x, BigInteger.valueOf(23));
        BigInteger b = g.modPow(y, BigInteger.valueOf(23));

        System.out.println("a is:" + a);
        System.out.println("b is:" + b);


        BigInteger bx = b.modPow(x, BigInteger.valueOf(23));
        BigInteger ay = a.modPow(y, BigInteger.valueOf(23));

        System.out.println("bx is:" + bx);
        System.out.println("ay is:" + ay);


        BigInteger z = bx.subtract(ay);
        System.out.println("z is:" + bx);

        BigInteger zabs = z.abs();
        BigInteger val = new BigInteger("0");

        int res;
        res = zabs.compareTo(val);

        if (res == 0)
            System.out.print("equal");
        else
            System.out.println("not equal");


    }

}