import java.util.Random;

public class Student {
    int id;
    final int courseMax = 6;
    String firstName;
    String lastName;
    int[] coursesRegistered = new int[courseMax];
    public Student(String firstName, String lastName){
        Random random = new Random();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = random.nextInt(300000,399999);
    }
}

