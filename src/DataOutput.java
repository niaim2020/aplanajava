import java.util.Scanner;

public class DataOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        //константы
        final int x = 5;
        final int y = 6;
        final int z = 7;

        if (number == x || number == y || number == z) {
            System.out.print("Данное значение имеется в константах");
        } else
            System.out.print("Такой константы нет!");
    }
}