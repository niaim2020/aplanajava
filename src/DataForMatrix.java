import java.util.Scanner;

public class DataForMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк в матрице: ");
        int amountRows = in.nextInt();
        System.out.print("Введите количество столбцов в матрице: ");
        int amountColumns = in.nextInt();

        int[][] matrix = new int[amountRows][amountColumns];

        for (int i = 0; i < amountRows; i++) {
            for (int j = 0; j < amountColumns; j++) {
                System.out.print("Произведите ввод данных с клавиатуры в элемент матрицы [" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < amountColumns; j++) {
            System.out.println("[0][" + j + "] элемент матрицы умноженный на 3: " + matrix[0][j] * 3);
        }
    }
}
