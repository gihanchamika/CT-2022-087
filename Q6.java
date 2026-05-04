import java.util.Scanner;
import java.time.Year;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birthYear = in.nextInt();

        //get current year from my pc
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
    }
}