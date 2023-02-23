import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[49];
        int[] entered = new int[6];
        for (int i=0; i<49; i++){
            nums[i] = i + 1;
        }
        int k=0;
        while(k<6){
            int index = rand.nextInt(49);
            if (nums[index] == 0){
                continue;
            }else{
                entered[k] = nums[index];
                nums[index] = 0;
                k++;
            }
        }
        Arrays.sort(entered);
        System.out.println("Полученные числа: " + Arrays.toString(entered));
    }
}