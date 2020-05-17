import java.util.Scanner;

public class FifteenSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int len = in.nextInt();
        int myArray[] = new int[len];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Введите число: ");
            myArray[i] = in.nextInt();
        }
        bubbleSort (myArray);
        System.out.print("Вывод элементов массива: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
    public static void bubbleSort(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
