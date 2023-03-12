//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package homework3;

import java.util.ArrayList;
import java.util.Random;

public class program3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 13; i++) {
            int n = rnd.nextInt(-13, 64);
            arr.add(n);
        }
        System.out.println(arr);
        arr.sort(null);
        double sum = 0;
        for (int item : arr) {
            sum += item;
        }
        System.out.printf("Минимальный элемент: %d, Максимальный элемент: %d, Среднее арифметическое: %.1f\n",
                arr.get(0), arr.get(arr.size() - 1), sum / arr.size());
    }
}
