import java.time.LocalDate;

public class Student {
    int id;
    String firstName;
    String lastName;
    int birthYear, birthMonth, birthDay;

    boolean isBirthday() {
        LocalDate now = LocalDate.now();
        return now.getYear() == birthYear && now.getMonthValue() == birthMonth && now.getDayOfMonth() == birthDay;
    }

    void giveWarning(boolean isFinalWarning) {
        System.out.printf("Dear %s %s:\n", firstName, lastName);
        if (isFinalWarning) {
            System.out.println("You are about to fail. You must make major changes immediately. This is your final warning.");
        } else {
            System.out.println("Your grades are unsatisfactory. You need to study more.");
        }
        System.out.println("Yours truly,");
        System.out.println("The Administration");
    }

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.id = 1;
        firstStudent.firstName = "Frank";
        firstStudent.lastName = "Hardy";
        firstStudent.birthYear = 1911;
        firstStudent.birthMonth = 9;
        firstStudent.birthDay = 13;
        System.out.println(firstStudent.isBirthday() ? "Happy Birthday " : "Good Day " + firstStudent.firstName);
        Student secondStudent = new Student();
        firstStudent.id = 2;
        secondStudent.firstName = "Joe";
        firstStudent.lastName = "Hardy";
        firstStudent.birthYear = 1912;
        firstStudent.birthMonth = 9;
        firstStudent.birthDay = 14;
    }
}
