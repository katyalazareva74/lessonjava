// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package homework2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class program1 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = new int[] { 1, 6, 3, 5, 9, 0, 4 };
        loggersort(array);
    }

    private static void loggersort(int[] arr) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(program1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        StringBuilder sd = new StringBuilder();
        for (int i = 0; i < (arr.length - 1); i++) {
            sd.append(arr[i]);
        }
        logger.info("Исходный массив: " + sd.toString());
        boolean sortend = false;
        int temp;
        while (!sortend) {
            sortend = true;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    sortend = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                sb.append(arr[j]);
            }
            sb.append(arr[arr.length - 1]);
            if (sortend)
                logger.info("Массив отсортирован!  " + sb.toString());
            else
                logger.info(sb.toString());
        }
    }
}
