public class University {
    String name;
    final int studentCapacity;
    final int courseCapacity;
    Student[] students;
    Course[] courses;

    public University(String name, int studentCapacity, int courseCapacity){
        this.name = name;
        this.studentCapacity = studentCapacity;
        this.courseCapacity = courseCapacity;
        this.students = new Student[studentCapacity];
        this.courses = new Course[courseCapacity];

    }
    public void enrollStudent(String firstName, String lastName){
        for(int i = 0; i < studentCapacity; i++) {
            if (students[i] == null) {
                students[i] = new Student(firstName, lastName);
                System.out.println(firstName + " has been enrolled in " + name);
                break;
            }
            if(i + 1 == studentCapacity){
                System.out.println(name + " is at student capacity.");
            }
        }
    }

    public void registerCourse(String prof, String faculty, int id, String name){
        for(int i = 0; i < courseCapacity; i++) {
            if (courses[i] == null) {
                if (faculty.equals("Math")) {
                    courses[i] = new MathCourse(prof, id, name);
                } else {
                    courses[i] = new Course(prof, id, name);
                }
                System.out.println("Course " + id + " has been added to " + this.name);
                break;
            }
            if(i + 1 == courseCapacity){
                System.out.println(name + " is at course capacity.");
            }
        }
    }

    public StudentRegistration registerStudent(String studentName, int courseID, boolean auditor){

        Student student = null;
        Course course = null;

        for(int i = 0; i < studentCapacity; i++){
            if(students[i].firstName.equals(studentName)){
                student = students[i];
                break;
            }
        }

        for(int i = 0; i < courseCapacity; i++){
            if(courses[i].id == courseID){
                course = courses[i];
                break;
            }
        }

        System.out.println(student.firstName + " has been regestered for " + course.name);
        return new StudentRegistration(student, course, auditor);
    }

}
