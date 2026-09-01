
import java.util.Scanner;

public class StringDuplicate
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();//abcd
		int[] count = new int[26];
	
		for(int i=0;i<str.length();i++){
			int val;
			int n=(int)str.charAt(i);
			if(n<97) {
				val = str.charAt(i) - 'A';
				count[val]++;
			}
			else{
				val = str.charAt(i) - 'a';
				count[val]++;
			}
		}
		for(int i=0;i<str.length();i++){
		    int val;
		    char ch=str.charAt(i);
		    if(ch >= 'A'&&ch<='Z')
		    {
		    	val=ch-'A';
		    }
		    else if(ch >= 'a'&&ch<='a')
		    {
		    	val=ch-'a';
		    }
		    else
		    {
		    	continue;
		    }
		    if(count[val]>1){
		        System.out.println(ch+"-"+count[val]);
		    }
		    if(count[val]>1){
		        count[val]=0;
		    }
		}
	}
}
