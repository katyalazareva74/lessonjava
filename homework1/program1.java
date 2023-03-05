
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package homework1;

import java.util.Scanner;

public class program1 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = iScanner.nextInt();
        double res1 = factor(num);
        int res2 = sum(num);
        System.out.printf("Треугольное число: %d\n%d!: %.1f\n", res2, num, res1);
        iScanner.close();
    }

    private static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    private static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }
}
