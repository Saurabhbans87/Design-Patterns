/**
 * Create by saurabh
 * Date: 29/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.chain.loan;

public class Client {
    public static void main(String[] args) {
        Loan manager = new Manager();
        Loan branchManager = new BranchManager();
        Loan branchHead = new BranchHead();

        manager.nextLoanApproval(branchManager);
        branchManager.nextLoanApproval(branchHead);

        manager.loanApproval(50000);
        manager.loanApproval(200000);
        manager.loanApproval(2000000);
        manager.loanApproval(500000000);
    }
}
