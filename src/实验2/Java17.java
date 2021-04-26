package 实验2;
import java.util.*;
public class Java17 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("请输入一个十进制数");
		int num=n.nextInt();
		toEight(num);
	}
	private static void toEight(int n) {
		if(n>1)
		{
			toEight(n/8);
		}
		System.out.print(n%8);
	}

}
