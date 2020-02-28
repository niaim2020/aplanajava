import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число X: ");
        double x = in.nextInt();
        System.out.print("Введите число Y: ");
        double y = in.nextInt();
        System.out.print("Введите число Z: ");
        double z = in.nextInt();

        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел X, Y, Z: " + String.format("%.2f", average));

        int halfAverage = (int) (average / 2);
        System.out.println("Деление среднего арифметического на 2 без остатка : " + halfAverage);

        if (halfAverage > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
