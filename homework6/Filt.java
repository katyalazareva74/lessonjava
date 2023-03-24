package homework6;

import java.util.HashSet;
import java.util.Map;

public class Filt {
    public static HashSet<NoteBook> filter1(HashSet<NoteBook> nb, Map<Integer, Integer> map1) {
        var nb1 = new HashSet<NoteBook>();
        String str = "";
        for (var item : map1.entrySet()) {
            switch (item.getKey()) {
                case 1:
                    for (var element : nb) {
                        if (element.getRamemory() >= item.getValue())
                            nb1.add(element);
                    }
                    return nb1;
                case 2:
                    for (var element : nb) {
                        if (element.getHarddrive() >= item.getValue())
                            nb1.add(element);
                    }
                    return nb1;
                case 3:
                    if (item.getValue() == 1)
                        str = "Linux";
                    if (item.getValue() == 2)
                        str = "Windows";
                    for (var element : nb) {
                        if (element.getOpsystem().equals(str))
                            nb1.add(element);
                    }
                    return nb1;
                case 4:
                    if (item.getValue() == 1)
                        str = "Черный";
                    if (item.getValue() == 2)
                        str = "Белый";
                    if (item.getValue() == 3)
                        str = "Красный";
                    for (var element : nb) {
                        if (element.getColour().equals(str))
                            nb1.add(element);
                    }
                    return nb1;
                default:
                    return nb1;
            }
        }
        return nb1;
    }
}
