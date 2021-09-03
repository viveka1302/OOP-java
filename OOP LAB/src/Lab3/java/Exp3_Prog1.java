package Lab3.java;

import java.util.Scanner;

public class Exp3_Prog1 {

	public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int[] array = new int[3];

       System.out.println("Enter the element");
       
       for (int i = 0; i < 3; i++) {
           array[i] = scan.nextInt();

       }
       System.out.println("All possible combinations are :");
       for (int x=0;x<3;x++) {

           for (int y = 0; y < 3; y++) {

               for (int z = 0; z < 3; z++) {

                   if (x != y && x != z && y != z) {

                       System.out.println(array[x] + "" + array[y] + "" + array[z]);

                   }

               }

           }

       }

   }

}
