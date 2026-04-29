package curriculum.k;

public abstract class Employee {

    protected String name;
    protected int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateSalary();
}