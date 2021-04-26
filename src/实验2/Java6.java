package 实验2;

import java.util.Scanner;

public class Java6 {

   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      System.out.println("请输入社保号码(例:DDD-DD-DDDD,D为数字)");
      String str = n.nextLine();
      int k;
      for(k = 0; k <= 2; ++k) 
      {
         if(!Character.isDigit(str.charAt(k))) 
         {
            System.out.println("号码输入错误");
            return;
         }
      }

      if(str.charAt(3) == 45 && str.charAt(6) == 45)
      {
         for(k = 4; k <= 5; ++k)
         {
            if(!Character.isDigit(str.charAt(k)))
            {
               System.out.println("号码输入错误");
               return;
            }
         }
         for(k = 7; k < 10; ++k) 
         {
            if(!Character.isDigit(str.charAt(k))) 
            {
               System.out.println("号码输入错误");
               return;
            }
         }
         System.out.println(str +"是正确的号码");
      } 
      else 
      {
         System.out.println("号码输入错误");
      }

   }
}