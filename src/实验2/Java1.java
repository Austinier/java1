package ʵ��2;
import java.util.*;
public class Java1 {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("�������һ����ľ�γ��:");
		double x1=n.nextDouble();
		double y1=n.nextDouble();
		System.out.println("������ڶ�����ľ�γ��:");
		double x2=n.nextDouble();
		double y2=n.nextDouble();
		double d=6371.01*Math.acos((Math.sin(Math.toRadians(x1)))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
		System.out.println("���Բ����Ϊ"+d+"km");
	}
}
