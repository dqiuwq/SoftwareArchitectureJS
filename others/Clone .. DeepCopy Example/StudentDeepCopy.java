public class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}

public class StudentDC {
    int number;
    Course course;

    public StudentDC(int number, Course course) {
        this.number = number;
        this.course = course;
    }

    public StudentDC clone() {
        Course course = new Course(this.course.courseName);
        int number = this.number;
        StudentDC tmpStudent = new StudentDC(number, course);
        return tmpStudent;
    }

    public static void main(String[] args) {
        Course course = new Course("Software Architectures");
        StudentDC studentDC1 = new StudentDC(5243, course);
        StudentDC studentDC2 = studentDC1.clone();
        System.out.println(studentDC1.hashCode());
        System.out.println(studentDC1.course.hashCode()); // different
        System.out.println(studentDC2.hashCode());
        System.out.println(studentDC2.course.hashCode()); // different
    }
}
