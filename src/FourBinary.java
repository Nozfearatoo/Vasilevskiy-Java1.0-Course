import java.util.Scanner;

public class FourBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String num1 = in.nextLine();       //  System.out.printf("Your number: %s \n", num1);

       int num2 = Integer.parseInt(num1, 2);

       System.out.printf("Your number: %d \n", num2);
    }
}