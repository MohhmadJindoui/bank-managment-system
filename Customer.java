package SecureBankManagement;

import java.time.LocalDate;
import java.util.Objects;

public class Customer extends Person implements Transactable{
    private String Name, Id;
    private Account account;


    public Customer(String name, String id, Account account) {
       super(name,id);
        this.account = account;

    }


    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public Account getAccount() {
        return account;
    }

    public void setName(String name) {
        if (name.length() == 10) {
            this.Name = name;
        }
    }

    public void setId(String id) {
        if (id.length() == 9) {
            this.Id = id;
        }
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer: " + getName() + ", ID: " + getAccount() + ", Account: [" +getAccount() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;}
            if (obj == null || getClass() != obj.getClass()) {
                return false;}

            Customer c = (Customer) obj;
            return this.getAccount().equals(c.getAccount())
                    && this.getId().equals(c.getId())
                    && this.getName().equals(c.getName());
    }

    @Override
    public void performTransaction(Account account, double amount) {
       double sum=account.getBalance()+amount;
        System.out.println("Customer Transaction:"+sum);

    }

}
