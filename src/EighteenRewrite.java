import java.io.*;

public class EighteenRewrite {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Vsevolod\\Desktop\\testRewrite.txt";
        String str1;
        String str2;
        int lines = 0;
        try (BufferedReader buffread1 = new BufferedReader(new FileReader(filename))) {
            while ((str1 = buffread1.readLine()) != null) {
                System.out.println(str1);
                lines++;
            }
        }  catch (IOException exc) {
            System.out.print("Error: " + exc);}
        try (BufferedReader buffread2 = new BufferedReader(new InputStreamReader(System.in))) {
            FileWriter writer2 = new FileWriter(filename);
            for (int i = 1; i <= lines; i++) {
                System.out.print("Введите строку: ");
                str2 = buffread2.readLine();
                str2 = str2 + '\n';
                writer2.write(str2);
            }  writer2.close();
        } catch (IOException exc) {
            System.out.print("Error: " + exc);}
    }
}
