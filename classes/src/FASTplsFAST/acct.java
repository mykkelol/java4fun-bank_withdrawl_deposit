package FASTplsFAST;

public class acct {

    private String custNum;
    private double custBalance;
    private String custName;
    private String custEmail;
    private String custPhone;

    // default empty constructor
    public acct() {
        this( "default num", 0.00,"default name","default@email.com", "303-123-4567");
    }

    // default constructor
    public acct(String custName, String custEmail, String custPhone) {
        this("00000", 0.00, custName, custEmail, custPhone);
    }

    // save constructor
    public acct(String custNum, double custBalance, String custName, String custEmail, String custPhone) {
        this.custNum = custNum;
        this.custBalance = custBalance;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhone = custPhone;
    }

    // deposit
    public void acctDeposit(int depositAmt){
        this.custBalance += depositAmt;
        System.out.println(depositAmt + " processed. Your balance is now: " + custBalance);
    }

    // withdrawl
    public void acctWithdrawl(int withdrawlAmt){
        // don't let users make withdrawl if it cause negative balance
        if ((this.custBalance - withdrawlAmt) < 0){
            System.out.println("Insufficient funds.");
        } else {
            this.custBalance -= withdrawlAmt;
            System.out.println(withdrawlAmt + " processed. Your remaining balance is now: " + custBalance);
        }
    }

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    public double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(double custBalance) {
        this.custBalance = custBalance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}

