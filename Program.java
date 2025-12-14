package SecureBankManagement;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        BankManagement bm = new BankManagement();


        AccountType accountType = new AccountType("Savings", 5000, 4);
        Account account = new Account("John Smith JohnSmith", "AC101", accountType, 1000, true, LocalDate.now());
        Customer customer = new Customer("JohnSmithy", "123456789", account);
        BankTeller teller = new BankTeller("Sarah Teller", "T12345678", 155555, "sarah@bank.com","moha", "Morning");
        BankManager manager = new BankManager("Manager1", "A1234567b", "123 Street", "adminBANK");

        bm.addCustomer(customer);
        bm.addBankTeller(teller);
        bm.addBankManagerWithComplexEmailValidation(manager);
        bm.Accounts.add(account);

        // בדיקת טיפוסי אובייקטים
        ArrayList<Person> people = new ArrayList<>();
        people.add(teller);
        people.add(manager);
        people.add(customer);
        bm.checkPerson(people);


        try {
            bm.checkAccountTypeExpertise();
        } catch (BankManagement.NotFitTellersException e) {
            System.out.println("Expertise mismatch: " + e.getMessage());
        }


        try {
            bm.SalaryBankersAverage();
        } catch (BankManagement.SalaryBankersAverageException e) {
            System.out.println("Salary Exception: " + e.getMessage());
        }


        teller.tasks();
        manager.tasks();


        System.out.println(teller.generateMonthlyReport());
        System.out.println(manager.generateMonthlyReport());

        teller.performTransaction(account, 500);
        customer.performTransaction(account, -500);
    }
}




