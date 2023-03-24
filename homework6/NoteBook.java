package homework6;

public class NoteBook {
    private int ramemory;
    private int harddrive;
    private String opsystem;
    private String colour;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setRamemory(int ramemory) {
        this.ramemory = ramemory;
    }

    public void setHarddrive(int harddrive) {
        this.harddrive = harddrive;
    }

    public void setOpsystem(String opsystem) {
        this.opsystem = opsystem;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRamemory() {
        return ramemory;
    }

    public int getHarddrive() {
        return harddrive;
    }

    public String getOpsystem() {
        return opsystem;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ноутбук " + this.name + ", RAM - " + this.ramemory + "Гб, HDD - " + this.harddrive
                + "Гб, Операционная система - "
                + this.opsystem + ", Цвет - " + this.colour + "\n";
    }
}
