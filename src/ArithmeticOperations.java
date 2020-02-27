import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число X: ");
        int x = in.nextInt();
        System.out.print("Введите число Y: ");
        int y = in.nextInt();
        System.out.print("Введите число Z: ");
        int z = in.nextInt();

        int average = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел X, Y, Z: " + average);

        int halfAverage = average/2;
        System.out.println("Деление среднего арифметического на 2 без остатка : " + halfAverage);

        if (halfAverage > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
