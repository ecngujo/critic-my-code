
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Integer> units;

    public Course(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    public void addUnits(int unit) {
        units.add(unit);
    }

    public String getCourseName() {
        return name;
    }
    public ArrayList<Integer> getCourseUnits() {
        return units;
    }
}
