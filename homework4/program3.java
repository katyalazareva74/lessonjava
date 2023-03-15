// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
// дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7
// В калькулятор добавьте возможность отменить последнюю операцию.
// ***Дополнительно*** каскадная отмена - отмена нескольких операций 

package homework4;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner iScanner = new Scanner(System.in);
        Deque<Double> queue = new LinkedList<Double>();
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите первое число:");
        double n1 = iScanner.nextDouble();
        queue.add(n1);
        System.out.println(
                "Если вы хотите отменить операцию,\n то введите слово отмена,\n если хотите завершить работу - выход.");
        while (!queue.isEmpty()) {
            sb = new StringBuilder();
            System.out.println(queue.peekLast());
            System.out.println("Введите знак операции:");
            String op1 = iScanner.next();
            op1 = op1.toLowerCase();
            if (op1.equals("отмена")) {
                queue.removeLast();
                sb.append("Отмена операции.  " + queue.peekLast());
                loggercal.logger1(sb);
            } else if (op1.equals("выход")) {
                queue.removeAll(queue);
                sb.append("Выход.  ");
                loggercal.logger1(sb);
            } else {
                System.out.println("Введите второе число:");
                double n2 = iScanner.nextDouble();
                queue = calc(op1, n2, queue);
            }
        }
        System.out.println("Завершение работы.");
        sb = new StringBuilder();
        sb.append("Завершение работы.");
        loggercal.logger1(sb);
        iScanner.close();
    }

    private static Deque<Double> calc(String op, double num2, Deque<Double> queue1)
            throws SecurityException, IOException {
        StringBuilder sb = new StringBuilder();
        double res;
        switch (op) {
            case "+":
                res = queue1.getLast() + num2;
                sb.append(queue1.getLast() + " + " + num2 + " = " + res);
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                queue1.addLast(res);
                return queue1;
            case "-":
                res = queue1.getLast() - num2;
                sb.append(queue1.getLast() + " - " + num2 + " = " + res);
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                queue1.addLast(res);
                return queue1;
            case "*":
                res = queue1.getLast() * num2;
                sb.append(queue1.getLast() + " * " + num2 + " = " + res);
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                queue1.addLast(res);
                return queue1;
            case "/":
                if (num2 == 0) {
                    sb.append(queue1.getLast() + " / " + num2 + "  На ноль делить нельзя!");
                    System.out.printf(sb.toString());
                    loggercal.logger1(sb);
                    return queue1;
                } else {
                    res = queue1.getLast() / num2;
                    sb.append(queue1.getLast() + " / " + num2 + " = " + res);
                    System.out.printf(sb.toString());
                    loggercal.logger1(sb);
                    queue1.addLast(res);
                    return queue1;
                }
            default:
                sb.append(queue1.getLast() + " " + op + " " + num2 + "  Неправильно введены данные!");
                System.out.printf(sb.toString());
                loggercal.logger1(sb);
                return queue1;
        }
    }
}
