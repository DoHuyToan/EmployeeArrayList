public class FullTimeEmployee extends Employee {
    private double bonus;
    private double fine;
    private double hardSalary;

    public FullTimeEmployee(String code, String name, int age, String phone, String email, double bonus, double fine, double hardSalary) {
        super(code, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public FullTimeEmployee(String code, String name, int age, String phone, String email) {
        super(code, name, age, phone, email);
    }

    @Override
    public double getSalary() {
        return hardSalary + bonus - fine;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                ", salary=" + getSalary() +
                '}';
    }
}
