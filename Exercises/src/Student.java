import java.time.LocalDate;

public class Student {
    int id;
    String firstName;
    String lastName;
    int birthYear, birthMonth, birthDay;

    boolean isBirthday() {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() == birthMonth && now.getDayOfMonth() == birthDay;
    }

    void giveWarning(boolean isFinalWarning) {
        System.out.printf("\nDear %s %s:\n\n", firstName, lastName);
        if (isFinalWarning) {
            System.out.println("You are about to fail. You must make major changes immediately. This is your final warning.");
        } else {
            System.out.println("Your grades are unsatisfactory. You need to study more.");
        }
        if (isBirthday()) {
            System.out.println("Happy Birthday!");
        } else {
            System.out.println("Good day.");
        }
        System.out.println("\nYours truly,");
        System.out.println("The Administration\n");
    }

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.id = 1;
        firstStudent.firstName = "Frank";
        firstStudent.lastName = "Hardy";
        firstStudent.birthYear = 1911;
        firstStudent.birthMonth = 9;
        firstStudent.birthDay = 13;
        firstStudent.giveWarning(false);

        Student secondStudent = new Student();
        secondStudent.id = 2;
        secondStudent.firstName = "Joe";
        secondStudent.lastName = "Hardy";
        secondStudent.birthYear = 1912;
        secondStudent.birthMonth = 9;
        secondStudent.birthDay = 14;
        secondStudent.giveWarning(true);
    }
}
