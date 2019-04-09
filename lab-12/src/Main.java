import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Лямда-выражение с 1 параметром");
        OneParameter one = (a) -> a * a;
        System.out.println("Введите 1 число");
        System.out.println("Квадрат числа равна " + one.one_parametr(in.nextInt()));

        System.out.println("\nЛямда-выражение с 2 параметрами");
        TwoParameter two = (sum1, sum2) -> (sum1 == sum2);
        System.out.println("Введите 2 трехзначных числа");
        int value1 = in.nextInt();
        int value2 = in.nextInt();

        int num1 = value1 / 100;
        int num2 = (value1 / 10) % 10;
        int num3 = value1 % 10 % 10;
        int sum1 = num1 + num2 + num3;

        int num4 = value2 / 100;
        int num5 = (value2 / 10) % 10;
        int num6 = value2 % 10 % 10;
        int sum2 = num4 + num5 + num6;
        in.close();
        if (two.queens(sum1, sum2)) {
            System.out.println("Сумма чисел " + sum1 + " равна сумме чисел " + sum2);
        }
        if (!two.queens(sum1, sum2)) {
            System.out.println("Сумма чисел " + sum1 + " не равна сумме чисел " + sum2);

            System.out.println(" Блочное лямда-выражение ");
            BlokLm three = (str) -> {
                String result = "";
                while (str.contains("  ")) {
                    String replace = str.replace("  ", " ");
                    str = replace;
                }
                return str;
            };

        }
    }
}