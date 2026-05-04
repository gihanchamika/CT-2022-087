import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter dollar amount (P): ");
        double P = in.nextDouble();

        System.out.print("Enter rate (R): ");
        double R = in.nextDouble();

        System.out.print("Enter years (N): ");
        int N = in.nextInt();

        double amount = P * Math.pow((1 + (R / 100)), N);

        System.out.println("Final Amount: " + amount);
    }
}