public class Employee {
    private int ID;
    private String name;
    private int age;
    private String sdt;
    private String email;
    private int salary;

    public Employee(int iD, String name, int age, String sdt, String email, int salary) {
        ID = iD;
        this.name = name;
        this.age = age;
        this.sdt = sdt;
        this.email = email;
        this.salary = salary;
    }
    public Employee() {
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    
}
