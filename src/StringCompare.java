import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = in.nextLine();
        // определяем длину строк
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 > length2) {
            System.out.println("Стройка с наибольшей длиной: " + str1);
        } else if (length1 < length2) {
            System.out.println("Стройка с наибольшей длиной: " + str2);
        } else
            System.out.println("Длины строк равны.");
    }
}
