package SecureBankManagement;

public interface Transactable{
    void performTransaction(Account account, double amount);
}
