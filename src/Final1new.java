import java.util.Scanner;

public class Final1new {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String num1 = in.nextLine();
        char[] numbers = num1.toCharArray();
       if (binCheck(numbers))
        System.out.printf("Your number: %d \n", binToInt(numbers));
       else System.out.print("It's not a binary number!");
    }
    static boolean binCheck (char[] array) {
        for (char c: array)
        if (c != '1' & c != '0') return (false);
        return (true);
    }
    static int binToInt (char[] array) {
        int num2 = 0;
        for (int i = array.length - 1; i >= 0; i--)
            if (array[i] == '1')
                num2 += Math.pow(2, (array.length - i - 1));
        return (num2);
    }
}