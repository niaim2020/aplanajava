import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int amount = in.nextInt();
        int array[] = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Произведите ввод данных с клавиатуры в " + i + " элемент массива: ");
            array[i] = in.nextInt();
        }

        System.out.println("Неотсортированный массив: " + Arrays.toString(array));

        bubbleSort(array);
    }

    public static void bubbleSort(int[] arrayToSort) {
        int changeCounter;
        do {
            changeCounter = 0;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = tmp;
                    changeCounter++;
                }
            }
        } while (changeCounter > 0);
        System.out.println("Отсортированный массив: " + Arrays.toString(arrayToSort));
    }
}
