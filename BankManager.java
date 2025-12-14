package SecureBankManagement;

import java.util.ArrayList;
import java.util.Objects;

public class BankManager extends Person implements Todaystasks,Reportable{
    private String Name;
    private String Id;
    private String address;
    private String email;
    ArrayList<BankTeller> BankTellers;

    public BankManager(String name,String id,String address,
    String email){super(name,id);
        if(name.length()==8){
            this.Name=name;}else System.out.println("the length is out of range !!!");

        if(id.length() == 9 && id.charAt(0) == 'A' && id.charAt(8)=='b'){
            this.Id = id;}
        else System.out.println("some thing is wrong !!!");

        this.address=address;
        this.email=email;
        this.BankTellers=new ArrayList<>();
    }
    public BankManager(String name){
        super(name);
        this.Id= "BAbcacbAB";
        this.address = "David38";
        this.email= "cdDavid@cd";
        this.BankTellers=new ArrayList<>();
    }


    public String getAddress() {
        return this.address;}
    public void setAddress(String address) {
        this.address = address;}

    public String getEmail() {
        return this.email;}

    public void setEmail(String email) {
        this.email = email;}

    public String getId() {
        return this.Id;}
    public void setId(String id) {
        this.Id = id;}

    public String getName() {
        return this.Name;}
    public void setName(String name) {
        this.Name = name;}

    @Override
    public String toString() {
        return "BankManager{"+"Name:"+getName()+ '\'' +
                "Id:"+getId()+ '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", BankTellers=" + BankTellers +
                '}';
    }
    public void changeAddress(String newAddress){
        this.address=newAddress;

    }

    @Override
    public boolean equals(Object o) {
        if(this==o){return true;}
        if (o == null || getClass() != o.getClass()) return false;
        BankManager b = (BankManager) o;
        return this.getAddress().equals(b.getAddress()) &&
                this.getId().equals(b.getId())&&
                this.getEmail().equals(b.getEmail())&&
                this.getName().equals(b.getName());
    }

    @Override
    public void tasks() {
        System.out.println("Manager's tasks for today.");
    }

    @Override
    public String generateMonthlyReport() {
        return  "The manager issued 30 reports.";
    }
}
