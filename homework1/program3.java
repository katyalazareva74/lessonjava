// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package homework1;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = iScanner.nextDouble();
        System.out.println("Введите знак операции:");
        String op = iScanner.next();
        System.out.println("Введите второе число:");
        double num2 = iScanner.nextDouble();

        switch (op) {
            case "+":
                System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%.1f * %.1f = %.1f\n", num1, num2, num1 * num2);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На ноль делить нельзя!\n");
                else
                    System.out.printf("%.1f / %.1f = %.1f\n", num1, num2, num1 / num2);
                break;
            default:
                System.out.println("Неправильно введены данные!\n");
                break;
        }
        iScanner.close();
    }
}
