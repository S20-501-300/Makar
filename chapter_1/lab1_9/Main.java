import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string1:");
        String str1 = in.nextLine();
        System.out.print("Enter string2:");
        String str2 = in.nextLine();

        System.out.println("string1 == string2\nResult ignore case:" + str1.trim().equalsIgnoreCase(str2.trim()));
    }
}
//trim() - возвращает символьную строку, получаемую удалением всех начальных и конечных пробелов