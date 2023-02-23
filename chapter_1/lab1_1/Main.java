package lab1.zad1;
import java.util.Scanner;
//задание 1
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num;
        if (in.hasNextInt()){
            num = in.nextInt();
        } else{
            throw new RuntimeException("It's not a number!");
        }
        System.out.println("2-ая: " + Integer.toString(num, 2) + '\n' +
                "8-ая: " + Integer.toString(num, 8) + '\n' +
                "16-ая: " + Integer.toString(num, 16));
    }
}