package homework6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interf {
    public static Map<Integer, Integer> interface1() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map1 = new HashMap<>();
        int num = 0;
        while ((4 < num) || (num < 1)) {
            System.out.println(
                    "Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
            num = scanner.nextInt();
        }
        switch (num) {
            case 1:
                System.out.println("Какой объем памяти Вас интересует");
                map1.put(1, scanner.nextInt());
                scanner.close();
                return map1;
            case 2:
                System.out.println("Какой объем жесткого диска Вас интересует");
                map1.put(2, scanner.nextInt());
                scanner.close();
                return map1;
            case 3:
                System.out.println("Введите цифру, соответствующую необходимому критерию: \n1 Linux\n2 Windows");
                map1.put(3, scanner.nextInt());
                scanner.close();
                return map1;
            case 4:
                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию:: \n1 Черный\n2 Белый\n3 Красный");
                map1.put(4, scanner.nextInt());
                scanner.close();
                return map1;
            default:
                scanner.close();
                return map1;
        }
    }
}
