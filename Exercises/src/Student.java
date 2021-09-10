public class Student {
    final int id;
    String firstName;
    final String lastName;
    int birthYear, birthMonth, birthDay;

    final static int MAX_NUMBER_OF_STUDENTS = 1000;
    static int studentCount = 0;
    static Student[] studentList = new Student[MAX_NUMBER_OF_STUDENTS];

    Student(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        id = studentCount;
        if (studentCount < MAX_NUMBER_OF_STUDENTS) {
            studentList[studentCount] = this;
            studentCount++;
        } else {
            System.out.println("Maximum number of students exceeded. Student not added.");
        }
    }

    boolean isBirthday() {
        return false;
    }

    void giveWarning(boolean isFinalWarning) {
        // Study!
    }

    int numberOfFriends() {
        // Duck
        return 1;
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Joe", "Cool");
        Student secondStudent = new Student("Frank", "Bombadil");
        secondStudent.firstName = "Tom";

        System.out.println(studentCount);
        System.out.println(studentList[1].lastName);
        System.out.println(studentList[1].firstName);
        System.out.println(studentList[1].id);
    }
}
