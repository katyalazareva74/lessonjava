// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package homework4;

import java.util.LinkedList;

public class program2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1 = program1.create();
        System.out.println(list1);
        System.out.printf("Первый элемент из очереди, не удаляет его   %d -->  ", first(list1));
        System.out.println(list1);
        int elem1 = dequeue(list1);
        System.out.printf("Первый элемент из очереди, удаляет его   %d -->  ", elem1);
        System.out.println(list1);
        enqueue(list1, elem1);
        System.out.printf("Помещает элемент в конец очереди   %d -->   ", elem1);
        System.out.println(list1);
    }

    private static void enqueue(LinkedList<Integer> list2, int elem) {
        list2.addLast(elem);
    }

    private static int dequeue(LinkedList<Integer> list2) {
        int elem = list2.pollFirst();
        return elem;
    }

    private static int first(LinkedList<Integer> list2) {
        int elem = list2.getFirst();
        return elem;
    }
}
