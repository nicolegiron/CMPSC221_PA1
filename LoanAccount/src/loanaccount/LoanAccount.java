package loanaccount;
/**
 *
 * @author Nicole Giron
 */
public class LoanAccount {
    private static double annualInterestRate;
    private double principle;
    
    public LoanAccount(double principle){
        this.principle = principle;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate/100;
    }
    
    public double calculateMonthlyPayment(int numberOfPayments){
        double monthlyInterest = annualInterestRate/12;
        double monthlyPayment = principle * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }
    
    public static void main(String[] args) {
        LoanAccount loan1 = new LoanAccount(5000.00);
        LoanAccount loan2 = new LoanAccount(31000.00);
        loan1.setAnnualInterestRate(1);
        loan2.setAnnualInterestRate(1);
        System.out.println("Monthly payments for loan1 of $5000.00 and loan2 $31000.00 for 3, 5, and 6 year loans at 1% interest.");
        System.out.println("Loan    3 years    5 years    6 years");
        System.out.printf("Loan1   %.2f     %.2f      %.2f%n", loan1.calculateMonthlyPayment(36), loan1.calculateMonthlyPayment(60), loan1.calculateMonthlyPayment(72));
        System.out.printf("Loan2   %.2f     %.2f     %.2f%n%n", loan2.calculateMonthlyPayment(36), loan2.calculateMonthlyPayment(60), loan2.calculateMonthlyPayment(72));
        
        loan1.setAnnualInterestRate(5);
        loan2.setAnnualInterestRate(5);
        System.out.println("Monthly payments for loan1 of $5000.00 and loan2 $31000.00 for 3, 5, and 6 year loans at 5% interest.");
        System.out.println("Loan    3 years    5 years    6 years");
        System.out.printf("Loan1   %.2f     %.2f      %.2f%n", loan1.calculateMonthlyPayment(36), loan1.calculateMonthlyPayment(60), loan1.calculateMonthlyPayment(72));
        System.out.printf("Loan2   %.2f     %.2f     %.2f%n", loan2.calculateMonthlyPayment(36), loan2.calculateMonthlyPayment(60), loan2.calculateMonthlyPayment(72));
    }
   
}
