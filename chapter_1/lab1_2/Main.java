import java.util.Scanner;
import java.lang.Math;

//задание 2
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter corner: ");
        int corner;
        if (in.hasNextInt()){
            corner = in.nextInt();
        } else{
            throw new RuntimeException("It's not a number!");
        }
        System.out.println("%: " + (corner % 360) +
                "\n floorMod(): " + Math.floorMod(corner, 360));
    }
}