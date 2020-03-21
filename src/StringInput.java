import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        System.out.println("Результат: " + str);
    }
}
