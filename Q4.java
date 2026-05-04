import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight (pounds): ");
        double weight = in.nextDouble();

        double calories = weight * 19;

        System.out.println("Calories needed: " + calories);
    }
}