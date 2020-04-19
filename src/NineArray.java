import java.util.Scanner;

public class NineArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int len = in.nextInt();
        int myArray[] = new int[len];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Введите число: ");
            myArray[i] = in.nextInt();
        }
        System.out.print("Вывод элементов массива с умножением на два: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] * 2 + ", ");
        }
    }
}
