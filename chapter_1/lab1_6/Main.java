import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter int n:");
        Scanner in = new Scanner(System.in);
        int number;
        if (in.hasNextInt()) {
            number = in.nextInt();
        }else
            throw new RuntimeException("It's not a number!");
        System.out.println("n! = " + factorial(number).toString());
    }

    public static BigInteger factorial(int n){
        BigInteger fact = BigInteger.valueOf(1);
        for (int i=1; i<=n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}