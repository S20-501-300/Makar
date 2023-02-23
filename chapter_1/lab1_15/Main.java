import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter int number:");
        int n;
        if (in.hasNextInt()) {
            n = in.nextInt();
        } else {
            throw new RuntimeException("It's not int number!");
        }
        List<List<Integer>> array = new ArrayList<>(n);
        array.add(new ArrayList<>());
        array.get(0).add(1);
        for (int i=1; i<n; i++){
            array.add(new ArrayList<>());
            array.get(i).add(1);
            for (int j=1; j<i; j++){
                int a = array.get(i-1).get(j-1);
                int b = array.get(i-1).get(j);
                array.get(i).add(a + b);
            }
            array.get(i).add(1);
        }
        for (List<Integer> list : array){
            System.out.println(list);
        }
    }

//    private static List<List<Integer>> createArray(int numRows) {
//        List<List<Integer>> arr = new ArrayList<>(numRows);
//        arr.add(new ArrayList<>());
//        arr.get(0).add(1);
//        for (int i = 1; i < numRows; i++) {
//            arr.add(new ArrayList<>());
//            arr.get(i).add(1);
//            for (int j = 1; j < i; j++) {
//                int a = arr.get(i - 1).get(j - 1);
//                int b = arr.get(i - 1).get(j);
//                arr.get(i).add(a + b);
//            }
//            arr.get(i).add(1);
//        }
//        return arr;
//    }
//
//    private static void getRow(){
//        List<Integer> row = new ArrayList<>();
//        for(int i = 0; i <= 3; i++){
//            row.add(0,1);
//            for(int j = 1; j < i; j++){
//                row.set(j, row.get(j) + row.get(j+1));
//            }
//        }
//    }
//
//
//    public static void print(List<List<Integer>> arr) {
//        for (List<Integer> list : arr) {
//            System.out.println(list);
//        }
//    }
}