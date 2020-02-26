import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String bin = in.nextLine();
        int decimal = Integer.parseInt(bin,2);
        System.out.println("Число в десятичном формате: " + decimal);
    }
}
