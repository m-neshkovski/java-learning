public class Customer {

    private String name;

    private int creditLimit;

    private String email;

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Default name", 0, "Default email");
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void printStatus() {
        System.out.println("Customer " + getName() + "(" + getEmail() + ") has a credit limit " + getCreditLimit() + ".");
    }
}
