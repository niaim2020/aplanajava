import java.io.*;
import java.util.Scanner;

public class DataUploadRecord {
    public static void main(String[] args) throws Exception {
        // выгрузка данных из файла и определение кол-ва строк в начальном файле
        FileReader fr = new FileReader("test18.txt");
        Scanner scan = new Scanner(fr);
        int i1 = 1;
        int numberOfLines = 0; // количество строк
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i1++;
            numberOfLines++;
        }
        System.out.println("Количество строк: "+numberOfLines);
        fr.close();

        // перезапись в тот же файл
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводите строки в тот же файл: ");

        int i2 = 0;
        try (FileWriter fw = new FileWriter("test18.txt")) {
            do {
                str = br.readLine();
                i2++;
                str = str + "\r\n";
                fw.write(str);
            } while (i2 != numberOfLines);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
