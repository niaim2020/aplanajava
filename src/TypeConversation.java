import java.util.Scanner;

public class TypeConversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = in.nextLine();
        System.out.println("Строковая переменная S: " + S);
        int X = Integer.parseInt(S);
        System.out.println("Числовая переменная X типа int: " + X);
        double Y = (double) X;
        System.out.println("Числовая переменная Y типа double: " + Y);
    }
}
