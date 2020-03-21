import java.util.Scanner;

public class SpaceRemove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String no_space_str = str.replace(" ", "");
        System.out.println("Результат: " + no_space_str);
    }
}
