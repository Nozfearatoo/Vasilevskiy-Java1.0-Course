import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int len = in.nextInt();
        int myArray[] = new int[len];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Введите число: ");
            myArray[i] = in.nextInt();
        }
        insertIntoSort(myArray);
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
    public static void insertIntoSort(int[] array) {
        int temp, j;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }
}
