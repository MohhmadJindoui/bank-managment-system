package SecureBankManagement;

import java.time.LocalDate;

public class AccountType{
    private String typeName;
    private double minNumBalance;
    private int freeTransactions;


    public String getTypeName(){
        return this.typeName;
    }
    public double getMinNumBalance() {
        return this.minNumBalance;
    }public int getFreeTransactions(){
        return this.freeTransactions;

    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }public void setMinNumBalance(double minNumBalance){
        if(minNumBalance>=1000 &&minNumBalance<=50000){
            this.minNumBalance=minNumBalance;
        }
    }public void setFreeTransactions(int freeTransactions) {
        if(freeTransactions>=3 && freeTransactions<=10){
        this.freeTransactions = freeTransactions;}
    }

    public AccountType(String typeName, double minNumBalance, int freeTransactions){
        this.typeName=typeName;
        this.freeTransactions=freeTransactions;
        this.minNumBalance=minNumBalance;

    }

    public AccountType(double minNumBalance){
        this.minNumBalance=minNumBalance;
        this.freeTransactions=3;
        this.typeName="Standard Account";
    }

@Override
    public String toString(){
        return "typeName:"+getTypeName()+
                "\nminNumBalance:"+getMinNumBalance()+
                "\nfreeTransactions:"+getFreeTransactions();
    }


    public boolean checkTransaction(){
        return freeTransactions == 3;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null  || getClass()!=obj.getClass()) return false;

        AccountType a = (AccountType) obj;
             return this.getMinNumBalance() == a.getMinNumBalance() &&
                    this.getTypeName().equals(a.getTypeName());
        }
    }


