// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску.

package homework5;

import java.util.Scanner;
import java.util.TreeMap;

public class program3 {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        int[][] arr1 = new int[8][8];
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите координаты начальной точки. Например: номер строки - 4, а номер столбца - 6. \nМожно попробовать - (4,7), (4,0), (0,4). \nВсего 4 варианта различных решений.");
        System.out.println("Введите номер строки от 0 до 7:");
        int x = iScanner.nextInt();
        System.out.println("Введите номер столбца от 0 до 7:");
        int y = iScanner.nextInt();
        int max = 7;
        for (int i = 0; i < 8; i++) {
            arr1[i][i] = 2;
            arr1[i][7 - i] = 2;
        }
        for (int j = 0; j < 4; j++) {
            arr[x][y] = 1;
            arr1 = num2(arr1, x, y);
            if (arr1[max - x][max - y] == 2) {
                System.out.println("Нет решений!\n");
                break;
            } else {
                arr[max - x][max - y] = 1;
                arr1 = num2(arr1, max - x, max - y);
                if (j != 3) {
                    tmap = num1(arr1, x, y);
                    if (tmap.size() == 0) {
                        System.out.println("Нет решений!\n");
                        break;
                    } else {
                        x = tmap.lastKey();
                        y = tmap.get(x);
                    }
                }
            }
        }
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.printf("\n");
        }
        iScanner.close();
    }

    private static TreeMap<Integer, Integer> num1(int[][] arr2, int x, int y) {
        TreeMap<Integer, Integer> tmap1 = new TreeMap<>();
        int n = 0;
        for (int i = y + 1; i <= (y + 2); i++) {
            for (int j = x - 2 + n; j <= (x + 2 - n); j++) {
                if ((0 <= j) && (j < 8) && (0 <= i) && (i < 8)) {
                    if (arr2[j][i] != 2) {
                        tmap1.put(j, i);
                        return tmap1;
                    }
                }
                j += 3 - 2 * n;
            }
            n++;
        }
        n = 0;
        for (int i = y - 2; i <= (y - 1); i++) {
            for (int j = x - 1 - n; j <= (x + 1 + n); j++) {
                if ((0 <= j) && (j < 8) && (0 <= i) && (i < 8)) {
                    if (arr2[j][i] != 2) {
                        tmap1.put(j, i);
                        return tmap1;
                    }
                }
                j += 1 + 2 * n;
            }
            n++;
        }
        return tmap1;
    }

    private static int[][] num2(int[][] arr2, int x, int y) {
        for (int i = 0; i < 8; i++) {
            arr2[x][i] = 2;
            arr2[i][y] = 2;
        }
        int i = 0;
        while (((x - i) > 0) && ((y + i) < 7)) {
            i++;
            arr2[x - i][y + i] = 2;
        }
        i = 0;
        while (((x + i) < 7) && ((y - i) > 0)) {
            i++;
            arr2[x + i][y - i] = 2;
        }
        i = 0;
        while (((x + i) < 7) && ((y + i) < 7)) {
            i++;
            arr2[x + i][y + i] = 2;
        }
        i = 0;
        while (((x - i) > 0) && ((y - i) > 0)) {
            i++;
            arr2[x - i][y - i] = 2;
        }
        return arr2;
    }
}
