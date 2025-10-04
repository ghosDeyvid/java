package aula07;

import java.util.Scanner;

public class AplicativoMedia {
   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("primeira nota ");
      float var2 = var1.nextFloat();
      System.out.println("Segunda nota");
      float var3 = var1.nextFloat();
      float var4 = (var2 + var3) / 2.0F;
      System.out.println("A media é " + var4);
      if (var4 > 9.0F) {
         System.out.println("Aprovado com louvor");
      }

   }
}

