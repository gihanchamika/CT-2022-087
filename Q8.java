import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = in.nextDouble();

        double volume = (4.0 / 3) * (3.14 * Math.pow(r, 3));

        System.out.println("Volume: " + volume);
    }
}