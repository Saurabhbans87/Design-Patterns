/**
 * Create by saurabh
 * Date: 29/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.loan;

public class BranchHead implements Loan{
    private Loan loan;

    @Override
    public void loanApproval(double amount) {
        if(amount <= 10000000){
            System.out.println("Loan "+amount +" has been approved");
        }else{
            System.out.println("We can not process more then 1cr, please contact to district branch");
        }
    }

    @Override
    public void nextLoanApproval(Loan loanNextApproval) {

    }
}
