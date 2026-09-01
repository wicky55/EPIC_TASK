

import java.util.Scanner;

public class StingSmallLetter {

    static String reverseString(String str) { // abz
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
        	char name=str.charAt(i);//a,b,z
        	int val=((int)name)-96;//97-96=1,98-96=2,123-96=26
        	int res=val%26+97;//1%26=0+97=97,2%26=0+97=9
        	result+=((char)res);
        }

        return result;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(StingSmallLetter.reverseString(str));


    }
}