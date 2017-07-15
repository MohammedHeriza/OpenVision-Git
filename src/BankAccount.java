/**
 * Created by OV_Lab2-7 on 7/15/2017.
 */
public class BankAccount {

    //attributes
    private int accountId;
    private int accountBalance;
    private int blananceMinimumAccount;
    private double withdraw;
    private double deposite;

    public BankAccount() {
        accountId = 0;
        accountBalance = 0;
        blananceMinimumAccount = 0;
        withdraw = 0;
        deposite = 0;
    }

    public BankAccount(int accountId, int accountBalance) {
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }


    //methods
    public void setaccountId(int accountId) {
        this.accountId = accountId;
    }

    public void withdrawAction(int withdraw) {
        if(accountBalance>withdraw)

        {
           accountBalance-=withdraw;
            System.out.println("you chose to with draw "+withdraw+" EGP and your new balance after withdraw is "+accountBalance+ "EGP");
        }else{
            System.out.println("No available money");

        }

        }

    }



