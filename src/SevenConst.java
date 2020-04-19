import java.util.Scanner;

public class SevenConst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int X = 11;
        int Y = 12;
        int Z = 13;

        if (number==X|number==Y|number==Z)  System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
        }
    }
