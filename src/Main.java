import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount ($) (no commas): ");
        double principal = input.nextDouble();

        System.out.println("Enter annual interest rate. (e.g 2.35)");
        double annualInterestRate = input.nextDouble() / 100;

        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        int dayPerYear = 365;
        double dailyRate = annualInterestRate / dayPerYear;
        int totalDays = dayPerYear * years;

        //FV = P × (1 + (r / 365))^(365 × t)
        double futureValue = principal * Math.pow(1 + dailyRate, totalDays);
        double totalInterest = futureValue - principal;

        System.out.println("Future Value: " + currency.format(futureValue));
        System.out.println("Total interest earned: " + currency.format(totalInterest));


    }
}