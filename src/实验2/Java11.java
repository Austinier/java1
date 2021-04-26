package 实验2;
import java.util.*;
public class Java11 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num=n.nextInt();
		int j=0;
		int[] str=new int[100];
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				str[j]=i;
				num=num/i;
				i=1;
				j++;
				continue;
			}
			else
				continue;
		}
		int k=0;
		while(str[k]!=0)
		{
			System.out.print(str[k]+",");
			k++;
		}
	}
}
