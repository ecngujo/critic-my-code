package baby_level.java.Student;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Subject> subjects;
    
    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public void viewSubjects() {
        int count = 1;
        for(Subject s : subjects) {
            System.out.println("Subject " + count + ": " + s.getSubjectName() + " - " + s.getSubjectUnits() + " units.");
            count++;
        }
    }

    public String getStudentName() {
        return name;
    }

    public int getTotalSubjects() {
        return subjects.size();
    }

    public int getTotalUnits() {
        int total = 0;
        for(Subject s : subjects) {
            total += s.getSubjectUnits();
        } 
        return total;
    }

    public void viewData() {
        System.out.println("Student name: " + getStudentName());
        System.out.println("Total subjects: " + getTotalSubjects());
        System.out.println("Total Units: " + getTotalUnits());
        viewSubjects();
    }
}
