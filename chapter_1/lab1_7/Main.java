import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final short MAX = Short.MAX_VALUE;
    static final int L = 32768;
    public static void main(String[] args) {
        System.out.printf("Enter 2 numbers [0;%d]: ", L + MAX);
        int a,b;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            a = in.nextInt();
        }else
            throw new RuntimeException("It's not a number!");
        if (in.hasNextInt()){
            b = in.nextInt();
        }else
            throw new RuntimeException("It's not a number!");
        if (CheckRight(a) && CheckRight(b)){
            throw new RuntimeException("First or second number isn't right");
        }
        short a1, b1;
        a1 = (short) (a - L);
        b1 = (short) (b - L);
        System.out.print("+: " + (a1 + b1 + 2*L) +
                "\na-b: " + (ShortToInt(a1) - ShortToInt(b1)) +
                "\nb-a: " + (ShortToInt(b1) - ShortToInt(a1)) +
                "\na*b: " + multiplying(a1, b1) +
                "\na/b: " + Delenie(a1, b1) +
                "\nb/a: " + Delenie(b1, a1) +
                "\na%b: " + Ostatok(a1, b1) +
                "\nb%a: " + Ostatok(b1, a1));
    }
    public static long multiplying(short a, short b){
        long res;
        res = (long) ShortToInt(a);
        res *= (long) ShortToInt(b);
        return res;
    }
    public static boolean CheckRight(int a){
        return (a < 0 || a > 65535);
    }
    public static int ShortToInt(short a){
        return a + L;
    }
    public static String Delenie(short a, short b){
        String res;
        double num;
        num = (double)ShortToInt(a)/ShortToInt(b);
        res = Double.toString(num);
        return res;
    }
    public static String Ostatok(short a, short b){
        String res;
        BigInteger num;
        if (ShortToInt(b) == 0){
            res = "Невозможно вычислить отстаток от деления, т.к. делитель равен 0";
        }else {
            num = (BigInteger.valueOf(ShortToInt(a) % ShortToInt(b)));
            res = num.toString();
        }
        return res;
    }
}