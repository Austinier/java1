package ʵ��2;
import java.util.*;
public class Java13 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("����������ܶ�");
		double amount=n.nextDouble();
		System.out.println("�������������");
		int year=n.nextInt();
		System.out.println("������������");
		double rate=n.nextDouble();
		double monrate=rate/1200;
		double monthpay=amount*(rate/1200)/(1-1/Math.pow(1+monrate,year*12));
		double totalpay=monthpay*year*12;
		double balance=amount;
		
		for(int i=1;i<=year*12;i++)
		{
			double interest=monrate*balance;
			double principal=monthpay-interest;
			balance=balance-principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
		}
	}

}
