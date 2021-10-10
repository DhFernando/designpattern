import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String args[]) {
        CompositeAccount ca = new CompositeAccount();
        ca.addAccount(new SavingAccount("acc 01", 500));
        ca.addAccount(new DepositeAccount("acc 02", 300));

        System.out.println(ca.getBalance());
    }
}

abstract class Account {
    public abstract float getBalance();
}

class DepositeAccount extends Account {
    private String accountNo;
    private float accountBalance;

    public DepositeAccount(String accountNo, float accountBalance) {
        super();
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
    }

    @Override
    public float getBalance() {
        return this.accountBalance;
    }
}

class SavingAccount extends Account {
    private String accountNo;
    private float accountBalance;

    public SavingAccount(String accountNo, float accountBalance) {
        super();
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
    }

    @Override
    public float getBalance() {
        return this.accountBalance;
    }
}

class CompositeAccount extends Account {
    private float totalBalance;
    private List<Account> accountList = new ArrayList<Account>();

    @Override
    public float getBalance() {
        totalBalance = 0;
        for (Account account : accountList) {
            totalBalance = totalBalance + account.getBalance();
        }
        return totalBalance;
    }

    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    public void removeAccount(Account acc) {
        accountList.remove(acc);
    }
}