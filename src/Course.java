public class Course {
    final int CAPACITY = 60;
    int[] studentsRegistered = new int[CAPACITY];
    String prof;
    int id;

    public Course(String prof, int id){
        this.prof = prof;
        this.id = id;
    }
}

