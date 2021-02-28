public class Developer extends Employee {
    public int overtime;

    public Developer(int iD, String name, int age, String sdt, String email, int salary, int overtime) {
        super(iD, name, age, sdt, email, salary);
    }

    public int income() {
        return getSalary() + getOvertime() * 200000;
    }

    public void display() {
        System.out.printf("\n%3d %15s %15d %12s %16s %16d %16d %16d\n", getID(), getName(), getAge(), getSdt(), getEmail(),
                getSalary(), getOvertime(), income());
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

}
