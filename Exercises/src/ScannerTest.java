import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // Input two numbers
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter your integer here: ");
        int i = kbReader.nextInt();
        System.out.print("Enter your double here: ");
        double d = kbReader.nextDouble();
        kbReader.close();

        // Perform calculation and output results
        double r = d * i;
        System.out.println("The result is: " + r);
    }
}
