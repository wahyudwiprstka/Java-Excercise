public class Manager extends Employee{
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
