import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = in.nextLine();

        str.codePoints()
                .filter(s -> s > 255)
                .forEach(s -> System.out.print("\nchar:" + (char) s + " unicode:" + s));

    }
}