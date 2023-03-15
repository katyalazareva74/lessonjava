//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package homework4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

/**
 * program1
 */
public class program1 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        Deque<Integer> queue = new LinkedList<Integer>();
        list1=create();
        System.out.println(list1);
        queue=reverse(list1);
        System.out.println(queue);
    }
    private static Deque<Integer> reverse(LinkedList<Integer> list2) {
        Deque<Integer> queue1 = new LinkedList<Integer>(); 
        for (Integer elem : list2) {
            queue1.addFirst(elem);
        }
        return queue1;
    }
    public static LinkedList<Integer> create() {
        LinkedList<Integer> list2 = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 13; i++) {
            int n = rnd.nextInt(-13, 64);
            list2.add(n);
        }
        return list2;
    }
}