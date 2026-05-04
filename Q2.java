import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter centimeters: ");
        double cm = in.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Feet: " + feet + " Inches: " + remainingInches);
    }
}