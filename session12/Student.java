package session12;

public class Student {
    int number;
    Course course;

    public Student() {}

    public Student(int number, Course course) {
        this.number = number;
        this.course = course;
    }

    // first example
    public Student clone() {
        Course course = new Course(this.course.courseName);
        int number = this.number;
        Student tmpStudent = new Student(number, course);
        return tmpStudent;
    }

    // second example
    public void copyConstructor(Student otherStudent) {
        this.number = otherStudent.number;
        Course tmpCourse = new Course(otherStudent.course.courseName);
        this.course = tmpCourse;
    }

    public static void main(String[] args) {
        //first example
        Course course = new Course("Software Architectures");
        Student student1 = new Student(5243, course);
        Student student2 = student1.clone();
        System.out.println(student1.hashCode());
        System.out.println(student1.course.hashCode()); // different hash
        System.out.println(student2.hashCode());
        System.out.println(student2.course.hashCode()); // different hash

        //second example
        Student student3 = new Student();
        student3.copyConstructor(student1);
        System.out.println(student3.hashCode());
        System.out.println(student3.course.hashCode()); // different hash
    }
}
