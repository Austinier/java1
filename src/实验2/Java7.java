package ʵ��2;
import java.util.Scanner;
public class Java7 {

   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      System.out.println("�������һ���ַ���");
      String str1 = n.nextLine();
      int sum=str1.length();
      System.out.println("������ڶ����ַ���");
      String str2 = n.nextLine();
      int num = str2.length();
      int x=0,i=0;
      while(i+num<=sum)
      {
         if(str2.equals(str1.substring(i,i+num))) 
         {
            x=1;
            break;
         }
         else
        	 i++;
        	continue;
      }
      if(x==1)
      {
         System.out.println(str2 + "��" + str1 + "��һ����");
      } 
      else 
      {
         System.out.println(str2 + "����" + str1 + "��һ����");
      }
   }
}