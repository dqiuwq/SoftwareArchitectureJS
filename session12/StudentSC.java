package session12;

public class StudentSC implements Cloneable {
    int number;
    Course course;

    public StudentSC(int number, Course course) {
        this.number = number;
        this.course = course;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void main(String[] args) {
        Course course = new Course("Software Architectures");
        StudentSC studentSC1 = new StudentSC(5243, course);
        StudentSC studentSC2 = (StudentSC) studentSC1.clone();
        System.out.println(studentSC1.hashCode());
        System.out.println(studentSC1.course.hashCode()); // same
        System.out.println(studentSC2.hashCode());
        System.out.println(studentSC2.course.hashCode()); // same
    }
}
