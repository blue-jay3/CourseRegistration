public class StudentRegistration {
    Student student;
    int studentID;
    int courseID;
    boolean auditor;

    public StudentRegistration(Student student, Course course, boolean auditor){
        this.student = student;
        this.studentID = student.id;
        this.courseID = course.id;
        this.auditor = auditor;
    }

}