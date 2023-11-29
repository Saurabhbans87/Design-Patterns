package design.patterns.behavioral.chain.loan;

public interface Loan {
    public void loanApproval(double amount);
    public void nextLoanApproval(Loan loan);
}
