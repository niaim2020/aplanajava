import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите любое число: ");
        int num = in.nextInt();

        System.out.println("Таблица умножения для числа от 1 до 10: ");
        System.out.println("Умножить на 1: " + num * 1);
        System.out.println("Умножить на 2: " + num * 2);
        System.out.println("Умножить на 3: " + num * 3);
        System.out.println("Умножить на 4: " + num * 4);
        System.out.println("Умножить на 5: " + num * 5);
        System.out.println("Умножить на 6: " + num * 6);
        System.out.println("Умножить на 7: " + num * 7);
        System.out.println("Умножить на 8: " + num * 8);
        System.out.println("Умножить на 9: " + num * 9);
        System.out.println("Умножить на 10: " + num * 10);
    }
}
