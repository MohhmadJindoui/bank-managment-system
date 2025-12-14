package SecureBankManagement;

import java.util.ArrayList;

public class BankManagement {
    private ArrayList<Customer> Customers;
    ArrayList<Account> Accounts;
    private ArrayList<BankTeller> BankTellers;
    private ArrayList<BankManager> BankManagers;

    // Constructor
    public BankManagement() {
        Customers = new ArrayList<>();
        Accounts = new ArrayList<>();
        BankTellers = new ArrayList<>();
        BankManagers = new ArrayList<>();
    }

    public boolean addCustomer(Customer c) {
        if (c == null) {
            System.out.println("Customer is null!");
            return false;
        }
        for (Customer s : Customers) {
            if (s.equals(c)) {
                return false;
            }
        }
        this.Customers.add(c);
        return true;
    }

    public boolean addBankTeller(BankTeller bt) {
        if (bt== null) {
            System.out.println("BankTeller is null!");
            return false;
        }
        for (BankTeller tel : BankTellers) {
            if (tel.equals(bt)) {
                return false;
            }
        }
        this.BankTellers.add(bt);
        return true;
    }


    public boolean addBankManagerWithComplexEmailValidation(BankManager bm) {
        if(bm==null){
            return false;}
        for (BankManager man:BankManagers){
            if(man.getId().equals(bm.getId()) ){
                return false;
            }
            if (bm.getEmail().length()<=10 && bm.getEmail().endsWith("BANK")) {
                BankManagers.add(bm);
                return true;
            }
            System.out.println("there is wrong!!");
        }return false;

    }
    public void assignShiftsBasedOnCustomerCount() {
        int amount = Customers.size();

        for (BankTeller teller : BankTellers) {
            if (amount > 100) {
                teller.setShift("Noon");
            }
            else{
                teller.setShift("Morning");}
        }
    }
    public void checkAccountTypeExpertise() throws NotFitTellersException{
        System.out.println("Running checkAccountTypeExpertise...");
        boolean allMatched = true;

        for (BankTeller teller : BankTellers) {
            for (Account account : Accounts) {
                if (!teller.getSpecialization().equals(account.getAccountType())) {
                    System.out.println("no expertise");
                    System.out.println("holderName:" + account.getHolderName());
                    System.out.println("AccountType:" + account.getAccountType());
                    allMatched = false;
                }
            }
        }

        if (allMatched) {
            System.out.println("The expertise works properly .");

        }else {
            throw new NotFitTellersException ("Officials were found without a match for accounting expertise.");
        }
    }
    public class NotFitTellersException extends Exception {
        public NotFitTellersException(String message) {
            super(message);
        }
    }


    public void checkPerson(ArrayList<Person> list) {
        for (Person person : list) {
            if (person instanceof BankTeller){
                System.out.println("Object of type BankTeller exist ");}
            else if (person instanceof BankManager){
                System.out.println("Object of type BankManager  exist ");
            } else if (person  instanceof Customer){
                System.out.println("Object of type Customer  exist ");
            }

        }
    }
    public void SalaryBankersAverage()throws SalaryBankersAverageException{
         double total=0;
         int sum=0;
        for (BankTeller bankTeller:BankTellers){
            total+=bankTeller.getSalary();
            sum++;
            if ((total/sum)>10000){
                throw new SalaryBankersAverageException("The average salary of bankers is over 10,000.");
            }else {
                System.out.println("Average normal salary:"+bankTeller.getSalary());
            }
        }
    }
    public class SalaryBankersAverageException  extends Exception {
        public SalaryBankersAverageException(String message){
            super(message);

        }
    }


    }
