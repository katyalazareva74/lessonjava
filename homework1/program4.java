// Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package homework1;

import java.util.Scanner;

public class program4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String text = iScanner.nextLine();

        text = text.replaceAll("[+= ]", "");
        char[] str = text.toCharArray();

        int sum1 = Character.digit(str[str.length - 2], 10) * 10 + Character.digit(str[str.length - 1], 10);
        if (str.length > 6)
            sum1 += Character.digit(str[str.length - 3], 10) * 100;

        if (check(str))
            System.out.println("Введены некорректные данные.");
        else {
            if (str[0] == '?' && str[2] == '?')
                equation1(str, sum1);
            if (str[0] == '?' && str[3] == '?')
                equation2(str, sum1);
            if (str[1] == '?' && str[2] == '?')
                equation3(str, sum1);
            if (str[1] == '?' && str[3] == '?')
                equation4(str, sum1);
        }
        iScanner.close();
    }

    private static boolean check(char[] arr) {
        return ((arr[2] == '?' & arr[3] == '?') | (arr[2] != '?' & arr[3] != '?') |
                (arr[1] == '?' & arr[0] == '?') | (arr[0] != '?' & arr[1] != '?')) ? true : false;
    }

    private static void equation1(char[] arr, int sum) {
        int num = Character.digit(arr[1], 10) + Character.digit(arr[3], 10);
        int x = (sum - num) / 20;
        if ((sum - num) % 20 == 0)
            System.out.printf("%d%s + %d%s = %d ", x, arr[1], x, arr[3], sum);
        else
            System.out.println("Нет решения данного уравнения!");
    }

    private static void equation2(char[] arr, int sum) {
        int num = Character.digit(arr[1], 10) + (Character.digit(arr[2], 10)) * 10;
        int x = (sum - num) / 11;
        if ((sum - num) % 11 == 0)
            System.out.printf("%d%s + %s%d = %d ", x, arr[1], arr[2], x, sum);
        else
            System.out.println("Нет решения данного уравнения!");
    }

    private static void equation3(char[] arr, int sum) {
        int num = (Character.digit(arr[0], 10)) * 10 + Character.digit(arr[3], 10);
        int x = (sum - num) / 11;
        if ((sum - num) % 11 == 0)
            System.out.printf("%s%d + %d%s = %d ", arr[0], x, x, arr[3], sum);
        else
            System.out.println("Нет решения данного уравнения!");
    }

    private static void equation4(char[] arr, int sum) {
        int num = (Character.digit(arr[0], 10)) * 10 + (Character.digit(arr[2], 10)) * 10;
        int x = (sum - num) / 2;
        if ((sum - num) % 2 == 0)
            System.out.printf("%s%d + %s%d = %d ", arr[0], x, arr[2], x, sum);
        else
            System.out.println("Нет решения данного уравнения!");
    }
}
