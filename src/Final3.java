import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите текущий курс доллара: ");
        double rate = in.nextDouble();
        System.out.print("Укажите сумму в рублях: ");
        double sum = in.nextDouble();
        double res = sum/rate;
        System.out.printf(sum + "₽ = $" + "%.2f", res);
    }
}
