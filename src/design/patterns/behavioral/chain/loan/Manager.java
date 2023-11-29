/**
 * Create by saurabh
 * Date: 29/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.loan;

public class Manager implements Loan{
    private Loan loan;
    @Override
    public void loanApproval(double amount) {
        if(amount <= 100000){
            System.out.println("Loan "+amount +" amount has been approved");
        }else{
            loan.loanApproval(amount);
        }
    }
    @Override
    public void nextLoanApproval(Loan loanNextApproval) {
        this.loan = loanNextApproval;
    }
}
