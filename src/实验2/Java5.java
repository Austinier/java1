package ʵ��2;
import java.util.*;
public class Java5 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("���������");
		int year=n.nextInt();
		n.nextLine();
		System.out.println("�������·ݵ�ǰ������ĸ(����ĸ��д)");
		String mon = n.nextLine();
		if (mon.charAt(0) > 'Z' || mon.charAt(0) < 'A') 
		{
            System.out.println("\u6708\u4efd\u8f93\u5165\u9519\u8bef");
            return;
        }
		if (mon.equals("Jan") || mon.equals("Mar") || mon.equals("May") || mon.equals("Jul") || mon.equals("Aug") || mon.equals("Oct") || mon.equals("Dec")) 
		{
			System.out.println(mon + " " + year + "��31��");
	    }
		else if (mon.equals("Jun") || mon.equals("Apr") || mon.equals("Sep") || mon == "Sep" || mon == "Nov")
		{
	        System.out.println(mon + " " + year + "��30��");
	    }
		else
		{
			if(year%4==0||year%400==0)
			{
				System.out.println(mon + " " + year + "��29��");
			}
			else
			{
				System.out.println(mon + " " + year + "��28��");
			}
		}
		
	}

}
