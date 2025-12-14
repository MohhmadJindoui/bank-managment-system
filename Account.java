package SecureBankManagement;

import java.time.LocalDate;

public class Account{
    private String holderName,accountId;
    private AccountType accountType;
    private double balance;
    private boolean isActive;
    private LocalDate openDate;


    public Account(String holderName, String accountId, AccountType accountType, double balance,
                   boolean isActive, LocalDate openDate) {
        this.accountId=accountId;
        this.accountType=accountType;
        this.openDate=openDate;
        if(accountId.length()<7){
            this.balance = balance;}
        this.isActive=isActive;
        if(holderName.length()>15){
            this.holderName = holderName;}
    }

    public Account(){
        this.holderName = " AccountHolder";
        this.accountId = "AB123";
        this.accountType = new AccountType("Default Account ", 2000,3);
        this.balance = 0.0;
        this.isActive = true;
        this.openDate = LocalDate.now();
    }


    public String getAccountId(){
        return this.accountId;}
    public String getHolderName(){
        return this.holderName;
    }public AccountType getAccountType() {
        return this.accountType;
    }public double getBalance() {
        return this.balance;
    }public boolean getIsActive(){
        return this.isActive;
    }public LocalDate getOpenDate(){
        return this.openDate;
    }


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }public void setBalance(double balance) {
        this.balance = balance;

    }public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }public void setActive(boolean active) {
        isActive = active;
    }public void setHolderName(String holderName) {
            this.holderName = holderName;
    }public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }
@Override
    public String toString(){
        return "holderName:"+getHolderName()+
                "\naccountId:"+getAccountId()+
                "\nAccountType:"+getAccountType()+
                "\nbalance:"+getBalance()+
                "\nisActive:"+getIsActive()+
                "\nopenDate:"+getOpenDate();
    }


    public boolean checkBalance(AccountType  account ){
        return account.getMinNumBalance() > this.accountType.getMinNumBalance();
    }


    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null || obj.getClass()!=getClass())return false;{

        }

        Account A=(Account) obj;
        return this.getIsActive()==A.getIsActive()&&
                this.getBalance()==A.getBalance()&&
                this.getAccountId().equals(A.getAccountId())&&
                this.getOpenDate()==A.getOpenDate()&&
                this.getAccountType()==A.getAccountType()&&
                this.getHolderName().equals(A.holderName);
    }


}



