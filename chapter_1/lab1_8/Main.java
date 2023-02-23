import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string:");
        System.out.println("Array string = " + Arrays.toString(in.nextLine().split("\\s+")));
    }
}