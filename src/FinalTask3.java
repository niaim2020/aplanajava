import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        Double rate = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        Double ruble = in.nextDouble();
        Double dollar = ruble / rate;
        System.out.println("Итого: " + dollar + " долларов без округления");

        DecimalFormat df = new DecimalFormat("###.##");
        String rateItog = df.format(rate);
        String rubleItog = df.format(ruble);
        String dollarItog = df.format(dollar);

        System.out.println("Курс доллара: " + rateItog);
        System.out.println("Количество рублей: " + rubleItog);
        System.out.println("Итого: " + dollarItog + " долларов");
    }
}
