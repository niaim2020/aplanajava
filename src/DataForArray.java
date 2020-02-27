import java.util.Scanner;

public class DataForArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array[] = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            System.out.print("Произведите ввод данных с клавиатуры в " + i + " элемент массива: ");
            array[i] = in.nextInt();
        }

        for (i = 0; i < 5; i++) {
            System.out.println(i + " элемент массива умноженный на 2: " + array[i] * 2);
        }
    }
}

