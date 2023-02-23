package lab1.zad4;
public class Main {
    public static void main(String[] args) {
        System.out.println("Result:" +
                "\nMax         : " + Double.MAX_VALUE +
                "\nMin         : " + Double.MIN_VALUE +
                "\nMin [0;+inf): " + 0 +
                "\nMin (0;+inf): " + Math.nextUp(0.0));
    }
}