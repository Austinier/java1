package ÊµÑé2;
import java.util.*;

public class Java4 {

   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      System.out.println("ÇëÊäÈë×Ö·û");
      char ch = n.nextLine().charAt(0);
      if(ch >= 65 && ch <= 90) 
      {
         ch = (char)(ch + 32);
      }

      if(ch >= 'a' && ch <= 'c') 
      {
         System.out.println("2");
      } 
      else if(ch >= 'd' && ch <= 'f') 
      {
         System.out.println("3");
      } 
      else if(ch >= 'g' && ch <= 'i') 
      {
         System.out.println("4");
      }
      else if(ch >= 'j' && ch <= 'l') 
      {
         System.out.println("5");
      } 
      else if(ch >= 'm' && ch <= 'o') 
      {
         System.out.println("6");
      } 
      else if(ch >= 'p' && ch <= 's') 
      {
         System.out.println("7");
      } 
      else if(ch >= 't' && ch <= 'v') 
      {
         System.out.println("8");
      } 
      else if(ch >= 'w' && ch <= 'z') 
      {
         System.out.println("9");
      } 
      else
      {
         System.out.println("ÊäÈë´íÎó");
      }

   }
}