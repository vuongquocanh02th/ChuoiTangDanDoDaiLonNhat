import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String getSortedSubsequence(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        String result = getSortedSubsequence(input);
        System.out.println("Chuoi con theo thu tu tang dan la: " + result);
        
    }
}