public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this(12345, 0.0, "Default Name", "default@example.com", "+38972345678");
        System.out.println("default constructor");
    }

    public BankAccount(int number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this(99999, 100.0, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double fundsAmount) {
        if(fundsAmount > 0.0) {
            this.balance += fundsAmount;
        }
        printBalance();
    }

    public void withdraw(double fundsAmount) {
        if(fundsAmount > 0.0 && this.balance >= fundsAmount) {
            this.balance -= fundsAmount;
        }
        printBalance();
    }

    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }
}
