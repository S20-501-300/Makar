import java.util.*;
public class Main {
    public static String method(int[] arr, int size){
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<size; i++){
            builder.append(" ").append(arr[i]);
        }

        return builder.toString();
    }
    public static void main(String[] args){
        System.out.println("Enter numbers (end with symbol 'e'):");
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt()){
            System.out.println("Entered incorrect data, please repeat:");
            in.next();
        }
        int[] nums = new int[0];
        while(in.hasNextInt()){
            nums = AddToArray(nums, in.nextInt());
        }
        String str = method(nums, nums.length);
        System.out.println(str);
    }

    public static int[] AddToArray(int[] mass, int num){
        int[] copy = new int[mass.length + 1];
        System.arraycopy(mass, 0, copy, 0, mass.length);
        copy[mass.length] = num;
        return copy;
    }
}
