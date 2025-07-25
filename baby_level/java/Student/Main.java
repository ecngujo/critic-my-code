package baby_level.java.Student;

public class Main {
    public static void main(String[] args) {
        Student mark = new Student("mark");
        mark.addSubject(new Subject("shit", 4));
        mark.addSubject(new Subject("syn", 2));
        
        mark.viewData();
    }
}
