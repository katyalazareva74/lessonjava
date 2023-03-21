// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

package homework5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != 3) {
            System.out.println("Введите 1) Добавление номера; \n2) Вывод всего; \n3) Выход.");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Введите фамилию:");
                String lastname = scanner.next().toLowerCase();
                System.out.println("Введите номер телфона:");
                int tnumber = scanner.nextInt();
                map1.put(tnumber, lastname);
            } else {
                if (num == 2)
                    printmap(map1);
            }
        }
        scanner.close();
    }

    private static void printmap(Map<Integer, String> map2) {
        Deque<String> queue = new LinkedList<>();
        for (var item : map2.entrySet()) {
            if (!queue.contains(item.getValue()))
                queue.add(item.getValue());
        }
        while (!queue.isEmpty()) {
            String st = queue.pollLast();
            StringBuilder str = new StringBuilder();
            str.append(st + ": ");
            for (var item : map2.entrySet()) {
                if (st.equals(item.getValue()))
                    str.append(item.getKey() + ", ");
            }
            str.setLength(str.length() - 2);
            System.out.println(str.toString());
        }
    }
}
