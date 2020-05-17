import java.io.*;

public class SeventeenWrite {
    public static void main(String[] args) {
        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для окончания введите строку «!!»");
        String str1;
        try (FileWriter writer = new FileWriter("C:\\Users\\Vsevolod\\Desktop\\testWriter123.txt")) {
            do
            {
            System.out.printf("Введите строку: ");
            str1 = buffread.readLine();
            // System.out.println(str1.compareTo("!!"));
            if (str1.compareTo("!!") == 0) break;
                str1 = str1 + "\n";
                writer.write(str1);
        }
        while (str1.compareTo("!!") != 0);
        }
        catch (IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}
