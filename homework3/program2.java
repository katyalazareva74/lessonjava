//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package homework3;

import java.util.ArrayList;
import java.util.Random;

public class program2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 14; i++) {
            int n = rnd.nextInt(-10, 49);
            arr.add(n);
        }
        System.out.println(arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            if ((arr.get(i) % 2) == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
