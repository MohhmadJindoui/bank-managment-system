package SecureBankManagement;

public abstract class Person{
    protected String Name,Id;

    public Person(String name,String id){
        this.Name=name;
        this.Id=id;
    }
    public Person(String name){
        this.Name=name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public abstract String toString();
}
