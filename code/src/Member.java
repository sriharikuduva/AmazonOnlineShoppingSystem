public class Member extends Customer {
    private Account account;

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean placeOrder(Order order) {

    }
}
