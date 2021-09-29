import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    
    int id;
    int yearEntered;
    List<CourseCreditRecord> credits = new ArrayList<CourseCreditRecord>();

    Student(String name, int yearBorn, int id, int yearEntered) {
        super(name, yearBorn);
        this.id = id;
        this.yearEntered = yearEntered;
    }
}
