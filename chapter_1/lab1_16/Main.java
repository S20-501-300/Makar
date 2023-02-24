import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers (end with symbol 'e'):");
        Scanner in = new Scanner(System.in);
        while(!in.hasNextDouble()){
            System.out.println("Entered incorrect data, please repeat:");
            in.next();
        }
        double first = in.nextDouble();
        double[] nums = new double[0];
        while(in.hasNextDouble()){
            nums = AddToArray(nums, in.nextDouble());
        }
        System.out.println(average(first, nums));
    }

    public static double average(double first, double... nums){
        double sum = first;
        for(double n : nums){
            sum += n;
        }
        return sum/(nums.length + 1);
    }
    public static double[] AddToArray(double[] mass, double num){
        double[] copy = new double[mass.length + 1];
        System.arraycopy(mass, 0, copy, 0, mass.length);
        copy[mass.length] = num;
        return copy;
    }
}