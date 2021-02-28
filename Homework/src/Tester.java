public class Tester extends Employee {
    public int bugfound;

    public Tester(int iD, String name, int age, String sdt, String email, int salary, int bugfound) {
        super(iD, name, age, sdt, email, salary);
    }

    public int income() {
        return getSalary() + getBugfound() * 50000;
    }

    public void display() {
        System.out.printf("\n%3d %15s %15d %12s %16s %16d %16d %16d\n", getID(), getName(), getAge(), getSdt(), getEmail(),
                getSalary(), getBugfound(), income());
    }

    public int getBugfound() {
        return bugfound;
    }

    public void setBugfound(int bugfound) {
        this.bugfound = bugfound;
    }
}