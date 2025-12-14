package SecureBankManagement;

import java.util.Objects;

public class BankTeller extends Person implements Todaystasks,Transactable,Reportable{
    private String name,id;
    private double salary;
    private String email;
    private String specialization;
    private String shift;

    public BankTeller(String name,String id,
                      double salary1,String email1,
                      String specialization1,String shift1){
        super(name,id);
        setEmail(email1);
        this.salary=salary1;
        this.specialization=specialization1;
        this.shift=shift1;

    }
    public BankTeller(String id){
        super(id);
        name = " BankTeller ";
        salary = 2500;
        shift = "Night";
        email = "teller@securebank.com";
        specialization = "General";
    }

    public double getSalary() {
        return this.salary;
    }
    public String getName() {
        return this.name;
    }public String getId() {
        return id;
    }public String getEmail() {
        return this.email;
    }public String getSpecialization() {
        return this.specialization;
    }public String getShift() {
        return this.shift;
    }


    public void setName(String name) {
        this.name = name;
    }public void setId(String id) {
        this.id = id;
    }public void setSalary(double salary) {
        this.salary = salary;
    }public void setEmail(String email) {
        this.email = email;
    }public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }public void setShift(String shift) {
        this.shift = shift;
    }


    public String toString() {
        return "BankTeller{"+"Name:"+getName()+ '\'' +
                "Id:"+getId()+'\''+
                ", salary=" + getSalary() +
                ", email='" + getEmail() + '\'' +
                ", specialization='" + getSpecialization() + '\'' +
                ", shift='" + getShift() + '\'' +
                '}';
    }
    public void changeShift(String newShift){
        this.shift=newShift;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj){return  true;}
        if (obj==null  || getClass()!=obj.getClass()){ return false;}

        BankTeller b=(BankTeller) obj;

        return  this.getName().equals(b.getName()) &&
                this.getEmail().equals(b.getEmail())
                &&this.getId().equals(b.getId())
                && this.getSalary()==b.getSalary()
                &&this.getSpecialization().equals(b.getSpecialization())
                &&this.getShift().equals(b.getShift());
    }

    @Override
    public void tasks() {
        System.out.println("Banking tasks for today.");
    }
    @Override
    public void performTransaction(Account account, double amount) {
       double sum=account.getBalance()+amount;
        System.out.println("BankTeller Transaction:"+sum);

    }
    @Override
    public String generateMonthlyReport() {
        return "The banker issued 10 reports.";
    }

}
