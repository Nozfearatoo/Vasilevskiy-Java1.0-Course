import java.io.*;

public class SixteenRead {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Vsevolod\\Desktop\\test.txt";
        try
            (BufferedReader buffread = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = buffread.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}