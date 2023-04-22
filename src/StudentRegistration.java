public class StudentRegistration {
    int studentID;
    int courseID;
    boolean auditor;

    public StudentRegistration(int studentID, Course course, boolean auditor){
        this.studentID = studentID;
        this.courseID = course.id;
        this.auditor = auditor;
    }

}