package lab1.zad3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int[] nums = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        for (int i=0; i<3; i++){
            if(in.hasNextInt()){
                nums[i] = in.nextInt();
            } else{
                throw new RuntimeException("It's not 3 numbers");
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i=0; i<3; i++){
            if(nums[i]>max)
                max = nums[i];
        }
        int mathMax = Integer.MIN_VALUE;
        for (int i=0; i<3; i++){
            mathMax = Math.max(mathMax, nums[i]);
        }
        System.out.print("Max with loop: " + max +
                "\nMax with Math.max(): " + mathMax);
    }
}