import java.util.Scanner;

public class DataForArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int amount = in.nextInt();
        int array[] = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Произведите ввод данных с клавиатуры в " + i + " элемент массива: ");
            array[i] = in.nextInt();
        }

        for (int i = 0; i < amount; i++) {
            System.out.println(i + " элемент массива умноженный на 2: " + array[i] * 2);
        }
    }
}

