// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
// дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

package homework2;

import java.io.IOException;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double n1 = iScanner.nextDouble();
        System.out.println("Введите знак операции:");
        String op1 = iScanner.next();
        System.out.println("Введите второе число:");
        double n2 = iScanner.nextDouble();
        calc(n1, op1, n2);
        iScanner.close();
    }

    private static void calc(double num1, String op, double num2) throws SecurityException, IOException {
        StringBuilder sb = new StringBuilder();

        switch (op) {
            case "+":
                sb.append(num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                break;
            case "-":
                sb.append(num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                break;
            case "*":
                sb.append(num1 + " * " + num2 + " = " + (num1 * num2));
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                break;
            case "/":
                if (num2 == 0) {
                    sb.append(num1 + " / " + num2 + "  На ноль делить нельзя!");
                    System.out.printf(sb.toString());
                    loggercal.logger1(sb);
                } else {
                    sb.append(num1 + " / " + num2 + " = " + (num1 / num2));
                    System.out.printf(sb.toString());
                    loggercal.logger1(sb);
                }
                break;
            default:
                sb.append(num1 + " " + op + " " + num2 + "  Неправильно введены данные!");
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                break;
        }
    }
}
