import java.util.Scanner;

public class TwelveStringSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку:");
        String str1 = in.nextLine();
        for (String str2: str1.split(" ")) {
            System.out.printf(str2);
        /*
        Насколько я понял, это то же самое, что:
        String[] str1Parts = str1.split(" ");
        for (int i = 0; i < str1Parts.length; i++) {
        System.out.printf(str1Parts[i]); }
        */
        }
    }
}
