import java.util.Scanner;

public class FiveMultiplyTablePervert {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num1 = in.nextInt();
            int mult[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    // зачем я это делаю?
            System.out.println();
            System.out.println(num1 + "×" + mult[0] + "=" + num1*mult[0]);
            System.out.println(num1 + "×" + (mult[0]+1) + "=" + num1*(mult[0]+1));
            System.out.println(num1 + "×" + (mult[0]+2) + "=" + num1*(mult[0]+2));
            System.out.println(num1 + "×" + (mult[0]+3) + "=" + num1*(mult[0]+3));
            System.out.println(num1 + "×" + (mult[0]+4) + "=" + num1*(mult[0]+4));
            System.out.println(num1 + "×" + (mult[0]+5) + "=" + num1*(mult[0]+5));
            System.out.println(num1 + "×" + (mult[0]+6) + "=" + num1*(mult[0]+6));
            System.out.println(num1 + "×" + (mult[0]+7) + "=" + num1*(mult[0]+7));
            System.out.println(num1 + "×" + (mult[0]+8) + "=" + num1*(mult[0]+8));
            System.out.println(num1 + "×" + (mult[0]+9) + "=" + num1*(mult[0]+9));
        }
 }
