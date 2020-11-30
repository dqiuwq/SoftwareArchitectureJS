package exam;

public class MemberTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMemberID("331");
        student.setStudentID("11265");

        Staff staff = new Staff();
        staff.setMemberID("332");
        staff.setStaffID("20346");

        StudentStaff part_timer = new StudentStaff();
        part_timer.setMemberID("332");
        part_timer.setStudentID("10142");
        part_timer.setStaffID("20412");
    }
}
