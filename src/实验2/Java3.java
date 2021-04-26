package 实验2;
import java.util.*;
public class Java3 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("请输入一个十六进制数");
		String str=n.nextLine();
		int x=0;
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)<='9'&&str.charAt(i)>='0')||(str.charAt(i)>='A'&&str.charAt(i)<='F')||(str.charAt(i)<='f'&&str.charAt(i)>='a'))
				continue;
			else
				x=1;
		}
		if(x==1)
		{
			System.out.println("输入错误，输入不为 十六进制数");
		}
		else
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)<='9'&&str.charAt(j)>='0')
					sum=sum*16+str.charAt(j)-'0';
				else
				{
					if(str.charAt(j)>=97&&str.charAt(j)<=102)
						sum=sum*16+str.charAt(j)-87;
					else
						sum=sum*16+str.charAt(j)-55;
				}
			}
			toTwo(sum);
		}
	}
	public static void toTwo(int h)
	{
		if(h>1)
			toTwo(h/2);
		System.out.print(h%2);
	}
}
