// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package homework5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

public class program2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map = employee();
        name1(map);
    }

    private static Map<String, String> employee() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Иванов", "Иван");
        map1.put("Петрова", "Светлана");
        map1.put("Белова", "Кристина");
        map1.put("Мусина", "Анна");
        map1.put("Крутова", "Анна");
        map1.put("Юрин", "Иван");
        map1.put("Лыков", "Петр");
        map1.put("Чернов", "Павел");
        map1.put("Чернышов", "Петр");
        map1.put("Федорова", "Мария");
        map1.put("Светлова", "Марина");
        map1.put("Савина", "Мария");
        map1.put("Рыкова", "Мария");
        map1.put("Лугова", "Марина");
        map1.put("Влдаимирова", "Анна");
        map1.put("Мечников", "Иван");
        map1.put("Петин", "Петр");
        map1.put("Ежов", "Иван");
        return map1;
    }

    private static void name1(Map<String, String> map1) {
        Map<String, Integer> map2 = new HashMap<>();
        for (var item : map1.values()) {
            if (map2.containsKey(item))
                map2.put(item, map2.get(item) + 1);
            else
                map2.put(item, 1);
        }
        System.out.println(map2);
        ordering(map2);
    }

    private static void ordering(Map<String, Integer> map1) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Deque<Integer> dq = new LinkedList<>();
        LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>();
        for (var item : map1.entrySet()) {
            if ((map1.containsValue(item.getValue())) != (pq.contains(item.getValue()))) {
                pq.add(item.getValue());
            }
        }
        while (!pq.isEmpty()) {
            dq.addFirst(pq.poll());
        }
        while (!dq.isEmpty()) {
            int m = dq.poll();
            for (var item : map1.entrySet()) {
                if (m == item.getValue()) {
                    map3.put(item.getKey(), item.getValue());
                }
            }
        }
        System.out.println(map3);
    }
}
