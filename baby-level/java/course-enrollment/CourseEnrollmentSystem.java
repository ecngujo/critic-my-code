// 7.20.2025
// Topics: Class, Object, ArrayList, Scanner, Map, For Loop, If-Else

import java.util.*;

public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Student> root = new HashMap<>();

        System.out.print("How many students to register? ");
        int amount = sc.nextInt(); sc.nextLine();

        for(int i = 1; i <= amount; i++) {
            System.out.print("\nStudent " + i + " name: ");
            String studentName = sc.nextLine();
            System.out.print("How many courses they're enrolling in -> ");
            int totalCourses = sc.nextInt(); sc.nextLine();

            Student student = new Student(studentName);
            
            for(int o = 1; o <= totalCourses; o++) {
                System.out.print("Course " + o + " name: ");
                String courseName = sc.nextLine();
                
                Course course = new Course(courseName);

                System.out.print("Units -> ");
                int totalUnits = sc.nextInt(); sc.nextLine();
                course.addUnits(totalUnits);
                
                student.addCourse(course);
            }

            root.put(studentName, student);
        }

        while(true) {
            System.out.print("\n1 - View all enrollments \n2 - Search by student name \n3 - Exit\n=: ");
            int item = sc.nextInt(); sc.nextLine();

            switch(item) {
                case 1:
                    System.out.println("\n=[ALL ENROLLMENTS]=");
                    for(Map.Entry<String, Student> tree : root.entrySet()) {
                        String name = tree.getValue().getStudentName();
                        System.out.println("\n[Student Name]: " + name);
                        for(Course course : tree.getValue().getCourses()) {
                            System.out.println(course.getCourseName() + " : " + course.getCourseUnits());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Student name: ");
                    String studentName = sc.nextLine();
                    if(root.containsKey(studentName)) {
                        Student student = root.get(studentName);
                        for(Course course : student.getCourses()) {
                            System.out.println("* " + course.getCourseName() + " : " + course.getCourseUnits());
                        }
                    } else { 
                        System.out.println("Student not found."); 
                    }
                    break;
                case 3:
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("\nInput invalid.");
            }
        }

    }
}
