import java.util.Scanner;

public class FiveMultiplyTable {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            double num1 = in.nextDouble();
            // В задании не сказано про целые
            // Так что забираем и дробные; ответ показываем с тремя знаками просто потому что
            // Простой вариант для int в коменте ниже

            System.out.println();
            System.out.printf(num1 + "×" + 1 + "=" + "%.3f \n", num1);
            System.out.printf(num1 + "×" + 2 + "=" + "%.3f \n", num1*2);
            System.out.printf(num1 + "×" + 3 + "=" + "%.3f \n", num1*3);
            System.out.printf(num1 + "×" + 4 + "=" + "%.3f \n", num1*4);
            System.out.printf(num1 + "×" + 5 + "=" + "%.3f \n", num1*5);
            System.out.printf(num1 + "×" + 6 + "=" + "%.3f \n", num1*6);
            System.out.printf(num1 + "×" + 7 + "=" + "%.3f \n", num1*7);
            System.out.printf(num1 + "×" + 8 + "=" + "%.3f \n", num1*8);
            System.out.printf(num1 + "×" + 9 + "=" + "%.3f \n", num1*9);
            System.out.printf(num1 + "×" + 10 + "=" + "%.3f \n", num1*10);
        }
 }
 /*
   int num1 = in.nextInt();
   System.out.println();
                    System.out.println(num1 + "×" + 1 + "=" + num1*1);
                    System.out.println(num1 + "×" + 2 + "=" + num1*2);
                    System.out.println(num1 + "×" + 3 + "=" + num1*3);
                    System.out.println(num1 + "×" + 4 + "=" + num1*4);
                    System.out.println(num1 + "×" + 5 + "=" + num1*5);
                    System.out.println(num1 + "×" + 6 + "=" + num1*6);
                    System.out.println(num1 + "×" + 7 + "=" + num1*7);
                    System.out.println(num1 + "×" + 8 + "=" + num1*8);
                    System.out.println(num1 + "×" + 9 + "=" + num1*9);
                    System.out.println(num1 + "×" + 10 + "=" + num1*10);
*/