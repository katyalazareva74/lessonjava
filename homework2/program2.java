// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package homework2;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program2 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text.txt");
        try (Scanner scan1 = new Scanner(fr)) {
            String str1;
            Map<String, String> students = new HashMap<String, String>();
            while (scan1.hasNextLine()) {
                str1 = scan1.nextLine();
                students = parsing(str1);
                outputconsole(students);
            }
        }
        fr.close();
    }

    private static Map<String, String> parsing(String str) {
        Map<String, String> student = new HashMap<String, String>();
        String[] words = str.split(",");
        for (String word : words) {
            word = word.replace("\"", "");
            String[] dic = word.split(":");
            student.put(dic[0], dic[1]);
        }
        return (student);
    }

    private static void outputconsole(Map<String, String> student) {
        StringBuilder sb = new StringBuilder();
        sb.append("Студент " + student.get("фамилия") + " получил " + student.get("оценка") + " по предмету "
                + student.get("предмет"));
        System.out.println(sb.toString());
    }
}
