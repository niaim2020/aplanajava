import java.util.Scanner;

public class FinalTask1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int bin = in.nextInt();

        int decimal = 0;
        int power = 0;

        while (bin != 0)
        {
            decimal += ((bin % 10) * Math.pow(2, power));
            bin = bin / 10;
            power++;
        }

        System.out.println("Число в десятичном формате: " + decimal);
    }
}
