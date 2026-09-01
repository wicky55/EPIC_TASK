

import java.util.Scanner;

public class StringNext {

    static String reverseString(String str) { // Hello
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            
            int val = ((int) str.charAt(i)) + 1;
            result += (char) val;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(StringNext.reverseString(str));

        
    }
}