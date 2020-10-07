import metadata.AccountStatus;
import metadata.Address;

public class Account {
    private String userName, password, email, phone, name;
    private AccountStatus status;
    private Address shippingAddress;

    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> bankAccounts;

    public boolean addProduct(Product product);
    public boolean addProductReview(ProductReview review);
    public boolean resetPassword();
}