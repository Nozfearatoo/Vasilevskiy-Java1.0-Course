import java.util.Scanner;

public class ThirteenStringsCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку:");
        String str1 = in.nextLine();
        System.out.print("Введите вторую строку:");
        String str2 = in.nextLine();
        if (str1.length()==str2.length())  System.out.printf("Длины строк равны");
        if (str1.length()>str2.length()) System.out.printf(str1);
        if (str1.length()<str2.length()) System.out.printf (str2);
    }
}