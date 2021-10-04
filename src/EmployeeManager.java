import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeManager {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public void displayEmployee(ArrayList<Employee> employeeArrayList){
        for (Employee e: employeeArrayList) {
            System.out.println(e);
        }
    }

    public void addEmloyee(Employee employee){
        employeeArrayList.add(employee);
    }

    public void removeEmployee(int index){
        employeeArrayList.remove(index);
    }

    public void changeEmployee(int index, Employee employee){
        employeeArrayList.set(index, employee);
    }

    public double averageEmployee(){
        double sum = 0;
        for (Employee e: employeeArrayList) {
            sum += e.getSalary();
        }
        return sum/employeeArrayList.size();
    }

    public ArrayList<Employee> FullTimeEmployeeLowerAvgSalary(){
        ArrayList<Employee> newEmployeeArrayList = new ArrayList<>();
        for (Employee e: employeeArrayList) {
            if (e instanceof FullTimeEmployee && ((FullTimeEmployee)e).getSalary()<averageEmployee()){
                newEmployeeArrayList.add(e);
            }
        }
        return newEmployeeArrayList;
    }

    public ArrayList<Employee> showPartTimeEmployee(){
        ArrayList<Employee> newPartTimeEmployee = new ArrayList<>();
        for (Employee e: employeeArrayList) {
            if (e instanceof PartTimeEmployee){
                newPartTimeEmployee.add(e);
            }
        }
        return newPartTimeEmployee;
    }

    public double totalPartTiemEmployeeSalary(){
        double sum = 0;
        for (Employee e: employeeArrayList) {
            if (e instanceof PartTimeEmployee)
                sum += ((PartTimeEmployee)e).getSalary();
        }
        return sum;
    }

    public ArrayList<Employee> sortFullTimeEmployeeSalaryAscending(){
        ArrayList<Employee> newsortSalaryAscendingArrayList = new ArrayList<>();
        for (Employee e: employeeArrayList) {
            if (e instanceof FullTimeEmployee)
                newsortSalaryAscendingArrayList.add(e);
        }
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() > o2.getSalary() ?1:-1;
            }
        };
        newsortSalaryAscendingArrayList.sort(employeeComparator);
        return newsortSalaryAscendingArrayList;
    }
}
