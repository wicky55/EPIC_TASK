
import java.util.Scanner;
public class LongSubStringSequence {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String num=in.next();
		
		int max=0;
		for(int i=0;i<num.length();i++)
		{
			int sum=0;
			for(int j=i;j<num.length();j++)
			{
				if(num.charAt(j)=='1')
				{
					sum++;
					
				}
				else
				{
					sum--;
				}
				
				if (sum==0)
				{
					int count=((j-i)+1);
					if(count>max)
					{
						max=((j-i)+1);
						for(int k=i;k<=j;k++)
						{
							System.out.print(num.charAt(k)+" ");
						}
					}
				}
				
			}
			
		}
		System.out.println(max);
		

	}

}
