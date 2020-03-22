// прямой выбор
import java.util.Scanner;
import java.util.Arrays;

public class FinalTask2 {
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

        choiceSort(array);
    }

    public static void choiceSort(int[] arrayToSort) {
        int indexMin;
        for (int index = 0; index < arrayToSort.length - 1; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) {
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]) {
                    indexMin = indexToScan;
                }
            }

            int temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin] = temp;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arrayToSort));
    }
}
