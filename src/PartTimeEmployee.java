public class PartTimeEmployee extends Employee {
    private int timeWork;

    public PartTimeEmployee(String code, String name, int age, String phone, String email, int timeWork) {
        super(code, name, age, phone, email);
        this.timeWork = timeWork;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    public PartTimeEmployee(String code, String name, int age, String phone, String email) {
        super(code, name, age, phone, email);
    }

    @Override
    public double getSalary() {
        return timeWork * 100;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                super.toString() +
                ", salary=" + getSalary() +
                '}';
    }
}
