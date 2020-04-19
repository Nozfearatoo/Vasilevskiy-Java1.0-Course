import java.util.Scanner;

public class TenMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите количество строк и столбцов (через пробел): ");
        int rws = in.nextInt();
        int clmns = in.nextInt();
        int myMatrix[][] = new int[rws][clmns];
        for (int s = 0; s < rws; s++) {
            for (int c = 0; c < clmns; c++) {
                System.out.print("Введите значение для ячейки " + s + ";" + c + ": ");
                myMatrix[s][c] = in.nextInt();
            }
        }
        System.out.print("Вывод первой строки с умножением на три: ");
        for (int c = 0; c < clmns; c++) {
            System.out.print(myMatrix[0][c] * 3 + ", ");
        }
  }
}
