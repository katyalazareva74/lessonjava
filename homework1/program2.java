//Вывести все простые числа от 1 до 1000 

package homework1;

public class program2 {
    public static void main(String[] args) {
        symple();
    }

    private static void symple() {
        System.out.printf("%d %d %d ", 1, 2, 3);
        for (int i = 4; i < 1001; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0)
                System.out.printf("%d ", i);
        }
    }
}
