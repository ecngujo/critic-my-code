package baby_level.java.Student;

public class Subject {
    private String name;
    private int units;

    public Subject(String name, int units) {
        this.name = name;
        this.units = units;
    }

    public String getSubjectName() {
        return name;
    }

    public int getSubjectUnits() {
        return units;
    }
}
