package ʵ��2;
import java.util.*;
public class Java10 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("������ѧ���ĸ���");
		String[] name=new String[100];
		int num=n.nextInt();
		n.nextLine();
		int[] score=new int[100];
		int j,k,h;
		for(int i=0;i<num;i++)
		{
			System.out.println("������ѧ������");
			name[i]=n.nextLine();
			System.out.println("������ѧ������");
			score[i]=n.nextInt();
			n.nextLine();
		}
		for(j=0;j<num-1;++j)
		{
			for(k=0;k<num-1-j;++k)
			{
				if(score[k]<score[k+1])
				{
					String temp = name[k];
					name[k]=name[k+1];
					name[k+1]=temp;
					int sum=score[k];
					score[k]=score[k+1];
					score[k+1]=sum;
				}
			}
		}
		for(h=0;h<=1;h++)
		{
			System.out.println(name[h]+"   "+score[h]);
		}
	}
}