import java.util.Scanner;

public class DataForMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[2][3];
        int i;
        int j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Произведите ввод данных с клавиатуры в элемент матрицы [" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }

        for (j = 0; j < 3; j++) {
            System.out.println("[0][" + j + "] элемент матрицы умноженный на 3: " + matrix[0][j] * 3);
        }
    }
}
