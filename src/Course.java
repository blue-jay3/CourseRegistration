public class Course {
    final int CAPACITY = 60;
    int[] studentsRegistered = new int[CAPACITY];
    String prof;
    int id;

    String name;

    public Course(String prof, int id, String name){
        this.prof = prof;
        this.id = id;
        this.name = name;
    }
}

