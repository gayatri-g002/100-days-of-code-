import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
      
        /*
         * Syntax of for loops:
         * 
         * for (intialisation; condition; increment/decrement) {
         *      // body
         * }
         */

         // Q: Print numbers from 1 to 5
       
         //  for (int num = 1; num <=5; num += 1) {
            
        //    for (int num = 1; num <=5; num += 2) { 
        //     System.out.println(num);
        //  }

        // print the number from 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 1; num <=n; num++) {
        //     // System.out.println(num + " ");
        //     System.out.println("hello world");
        // }

        // while loops
        /*
         * SAyntax:
         * while (condition) {
         * //body
         * }
         */

        //  int num = 1;
        //  while (num <=5) {
        //     System.out.println(num);
        //     num +=1;
        //  }

         // do while loop
         /*
          * 
          do {
            //body
          } while (condition);

          */

         int n = 1;
         do {
            System.out.println(n);
            n++;
         } while (n <= 5);


    }
}
