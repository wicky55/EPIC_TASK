
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Word:");
		String word=in.next();
		String emp="";
		for(int i=word.length()-1;i>=0;i--)
		{
			emp += word.charAt(i)+" ";
			
		}
		System.out.println(emp);
		
	}

}
