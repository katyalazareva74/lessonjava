package homework6;

import java.util.HashSet;

public class Data {
    public static HashSet<NoteBook> input() {
        var lap = new HashSet<NoteBook>();
        NoteBook notebook1 = new NoteBook();
        NoteBook notebook2 = new NoteBook();
        NoteBook notebook3 = new NoteBook();
        NoteBook notebook4 = new NoteBook();
        NoteBook notebook5 = new NoteBook();

        notebook1.setName("Asus");
        notebook2.setName("HP");
        notebook3.setName("Acer");
        notebook4.setName("Dell");
        notebook5.setName("Dell");

        notebook1.setRamemory(32);
        notebook2.setRamemory(16);
        notebook3.setRamemory(8);
        notebook4.setRamemory(16);
        notebook5.setRamemory(32);

        notebook1.setHarddrive(320);
        notebook2.setHarddrive(250);
        notebook3.setHarddrive(250);
        notebook4.setHarddrive(320);
        notebook5.setHarddrive(160);

        notebook1.setOpsystem("Linux");
        notebook2.setOpsystem("Windows");
        notebook3.setOpsystem("Linux");
        notebook4.setOpsystem("Windows");
        notebook5.setOpsystem("Linux");

        notebook1.setColour("Черный");
        notebook2.setColour("Белый");
        notebook3.setColour("Красный");
        notebook4.setColour("Черный");
        notebook5.setColour("Черный");

        lap.add(notebook1);
        lap.add(notebook2);
        lap.add(notebook3);
        lap.add(notebook4);
        lap.add(notebook5);
        return lap;
    }

    public static void output(HashSet<NoteBook> lap) {
        for (var item : lap) {
            System.out.println(item.toString());
        }
    }
}
