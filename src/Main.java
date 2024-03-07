import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger result = factorial(3);
        System.out.println(result);
    }

    public static BigInteger factorial(int value) {
        BigInteger n = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        return n;
    }
}
