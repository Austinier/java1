package ʵ��2;

import java.util.Scanner;

public class Java6 {

   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      System.out.println("�������籣����(��:DDD-DD-DDDD,DΪ����)");
      String str = n.nextLine();
      int k;
      for(k = 0; k <= 2; ++k) 
      {
         if(!Character.isDigit(str.charAt(k))) 
         {
            System.out.println("�����������");
            return;
         }
      }

      if(str.charAt(3) == 45 && str.charAt(6) == 45)
      {
         for(k = 4; k <= 5; ++k)
         {
            if(!Character.isDigit(str.charAt(k)))
            {
               System.out.println("�����������");
               return;
            }
         }
         for(k = 7; k < 10; ++k) 
         {
            if(!Character.isDigit(str.charAt(k))) 
            {
               System.out.println("�����������");
               return;
            }
         }
         System.out.println(str +"����ȷ�ĺ���");
      } 
      else 
      {
         System.out.println("�����������");
      }

   }
}