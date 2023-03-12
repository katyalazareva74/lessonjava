//Реализовать алгоритм сортировки слиянием

package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program1 {
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 13; i++) {
            int n = rnd.nextInt(-13, 64);
            list0.add(n);
        }
        System.out.println(list0);
        sort(list0);
        System.out.println(list0);
    }

    private static void sort(List<Integer> list1) {
        if (list1.size() > 1) {
            int mid = list1.size() / 2;
            List<Integer> listlt = list1.subList(0, mid);
            List<Integer> listr = list1.subList(mid, list1.size());
            sort(listlt);
            sort(listr);
            List<Integer> listlt1 = List.copyOf(listlt);
            List<Integer> listr1 = List.copyOf(listr);
            int i = 0, j = 0, k = 0;
            while ((i < listlt1.size()) & (j < listr1.size())) {
                if (listlt1.get(i) < listr1.get(j)) {
                    list1.set(k, listlt1.get(i));
                    i++;
                } else {
                    list1.set(k, listr1.get(j));
                    j++;
                }
                k++;
            }
            while (i < listlt1.size()) {
                list1.set(k, listlt1.get(i));
                i++;
                k++;
            }
            while (j < listr1.size()) {
                list1.set(k, listr1.get(j));
                j++;
                k++;
            }
        }
    }
}