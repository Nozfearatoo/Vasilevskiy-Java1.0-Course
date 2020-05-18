import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String num1 = in.nextLine();
        char[] numbers = num1.toCharArray();
        int num2 = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
                if (numbers[i] == '1')
                    num2 += Math.pow(2, (numbers.length - i - 1));
        System.out.printf("Your number: %d \n", num2);
        }
}
