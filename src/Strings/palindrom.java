package Strings;
import java.util.*;

public class palindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length();

        int i = 0;
        int j = n - 1;

        while (i <= j) {

            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("not a palindrome");
                return;
            }

            i++;
            j--;
        }

        System.out.println("palindrome");
    }
}