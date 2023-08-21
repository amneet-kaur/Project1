package aug19;

public class Bank {
    // deposit
    // withdraw
    // balance
    double balance;
    public double deposit(double depositAmount){
        balance = balance + depositAmount;
        return balance;
    }

    public double withdraw(double withdrawnAmount) throws InsufficientBalanceException {
        if(withdrawnAmount > balance){
            throw new InsufficientBalanceException("Insufficient Balance Exception");
        }
        balance = balance - withdrawnAmount;
        return balance;
    }
}
