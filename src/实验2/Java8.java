package 实验2;
import java.util.*;
public class Java8 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("请输入员工姓名");
		String name=n.nextLine();
		System.out.println("请输入每周的工作时间(小时)");
		int worktime=n.nextInt();
		System.out.println("请输入每小时的酬金");
		double pay=n.nextDouble();
		System.out.println("请输入联邦所得税税率(例:0.1)");
		double tax1=n.nextDouble();
		System.out.println("请输入州所得税税率(例:0.1)");
		double tax2=n.nextDouble();
		System.out.println("员工姓名: "+name);
		System.out.println("每周工作时间: "+worktime);
		System.out.println("每小时酬金: "+"$"+pay);
		System.out.println("总酬金: "+"$"+(pay*worktime));
		System.out.println("应缴联邦所得税税额: "+"("+(tax1*100)+"%): "+"$"+(tax1*pay*worktime));
		System.out.println("应交州所得税额: "+"("+(tax2*100)+"%): "+"$"+(tax2*pay*worktime));
		System.out.println("共缴纳税额: "+"$"+(tax1*pay*worktime+tax2*pay*worktime));
		System.out.println("净收入: "+"$"+((pay*worktime)-(tax1*pay*worktime+tax2*pay*worktime)));
	}

}
