package javaprograms;

import java.util.Scanner;

public class PatternNumbers
{

 public static void main(String[] args)
 {

     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter a range");
     int x = sc.nextInt();
     for(int i=1;i<=x;i++)
     {
         for (int j=1;j<=i;j++)
         {
         System.out.print(j);

         }
         System.out.println();

     }


 }

}
