import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = in.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = in.nextDouble();

        System.out.print("Enter loan period (years): ");
        int loanPeriod = in.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / 12;
        int numberOfPayments = loanPeriod * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }
}