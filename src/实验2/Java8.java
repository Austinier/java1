package ʵ��2;
import java.util.*;
public class Java8 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("������Ա������");
		String name=n.nextLine();
		System.out.println("������ÿ�ܵĹ���ʱ��(Сʱ)");
		int worktime=n.nextInt();
		System.out.println("������ÿСʱ�ĳ��");
		double pay=n.nextDouble();
		System.out.println("��������������˰˰��(��:0.1)");
		double tax1=n.nextDouble();
		System.out.println("������������˰˰��(��:0.1)");
		double tax2=n.nextDouble();
		System.out.println("Ա������: "+name);
		System.out.println("ÿ�ܹ���ʱ��: "+worktime);
		System.out.println("ÿСʱ���: "+"$"+pay);
		System.out.println("�ܳ��: "+"$"+(pay*worktime));
		System.out.println("Ӧ����������˰˰��: "+"("+(tax1*100)+"%): "+"$"+(tax1*pay*worktime));
		System.out.println("Ӧ��������˰��: "+"("+(tax2*100)+"%): "+"$"+(tax2*pay*worktime));
		System.out.println("������˰��: "+"$"+(tax1*pay*worktime+tax2*pay*worktime));
		System.out.println("������: "+"$"+((pay*worktime)-(tax1*pay*worktime+tax2*pay*worktime)));
	}

}
