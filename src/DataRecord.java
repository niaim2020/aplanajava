import java.io.*;

public class DataRecord {
    public static void main(String args[]) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы остановить запись введите 'стоп' в новой строке");

        try (FileWriter fw = new FileWriter("file2.txt")) {
            do {
                str = br.readLine();

                if(str.compareTo("стоп") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
