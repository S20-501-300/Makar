import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<>();
        while(true){
            System.out.print("Enter string of numbers: ");
            String str = in.nextLine();
            if (str.length() > 0){
                String[] nums = str.trim().split("\\s+");
                List<Integer> arr = new ArrayList<>();
                for (String num : nums) {
                    arr.add(Integer.parseInt(num));
                }
                matrix.add(arr);
            }else break;
        }
        if(!CheckIsSquare(matrix)){
            throw new RuntimeException("It's not a square!");
        }
        if (CheckSum(matrix))
            System.out.println("It's a magic square!");
        else
            System.out.println("It isn't a magic square!");
    }

    public static boolean CheckIsSquare(List<List<Integer>> matrix){
        boolean fact = true;
        for(int i=0; i<matrix.size(); i++){
            if (matrix.get(i).size() != matrix.size()){
                fact = false; break;
            }
        }
        return fact;
    }
    public static boolean CheckSum(List<List<Integer>> matrix){
        int need = SumLine(matrix.get(0));
//        System.out.println("Need sum: " + SumLine(matrix.get(0)));
        for (List<Integer> integers : matrix) {
//            System.out.println("sum lines: " + SumLine(integers));
            if (SumLine(integers) != need)
                return false;
        }
        for (int i=0; i<matrix.size(); i++){
//            System.out.println("rows sum: " + SumColumn(matrix, i));
            if (SumColumn(matrix, i) != need)
                return false;
        }
//        System.out.println("Diagonal sum: " + SumLeftDiagonal(matrix));
        if (SumLeftDiagonal(matrix) != need)
            return false;
//        System.out.println("Diagonal sum: " + SumRightDiagonal(matrix));
        return SumRightDiagonal(matrix) == need;
    }

    public static int SumLine(List<Integer> line){
        int sum = 0;
        for (Integer integer : line) {
            sum += integer;
        }
        return sum;
    }
    public static int SumColumn(List<List<Integer>> matrix, int n){
        int sum = 0;
        for (List<Integer> integers : matrix) {
            sum += integers.get(n);
        }
        return sum;
    }
    public static int SumLeftDiagonal(List<List<Integer>> matrix){
        int sum = 0;
        for(int i = 0; i<matrix.size(); i++){
            sum += matrix.get(i).get(i);
        }
        return sum;
    }
    public static int SumRightDiagonal(List<List<Integer>> matrix){
        int sum = 0;
        for(int i = 0, j = matrix.size()-1; i<matrix.size(); i++, j--){
            sum += matrix.get(i).get(j);
        }
        return sum;
    }
}