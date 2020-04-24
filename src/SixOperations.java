import java.util.Scanner;

public class SixOperations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();
        double avrg = ((double)(num1+num2+num3))/3;
        double avrgdiv = avrg/2;
        System.out.println("Среднее арифметическое: " + avrg); // System.out.println(avrgdiv);
        if (avrgdiv > 3) System.out.println("Программа выполнена корректно");
    }
}