import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeManager toan = new EmployeeManager();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new FullTimeEmployee("001", "Toan1", 32, "09999999", "dhtoan89@", 100, 50 , 700));
        employeeArrayList.add(new FullTimeEmployee("002", "Toan2", 32, "09999999", "dhtoan89@", 100, 50 , 1500));
        employeeArrayList.add(new FullTimeEmployee("003", "Toan3", 32, "09999999", "dhtoan89@", 100, 50 , 600));
        employeeArrayList.add(new PartTimeEmployee("004", "Toan4", 32, "09999999", "dhtoan89@", 10));
        employeeArrayList.add(new PartTimeEmployee("005", "Toan5", 32, "09999999", "dhtoan89@", 5));

        toan.setEmployeeArrayList(employeeArrayList);
        System.out.println("Danh sách  toàn bộ nhân viên");
        toan.displayEmployee(employeeArrayList);

        System.out.println("Thêm nhân viên vào");
        toan.addEmloyee(new PartTimeEmployee("006", "Toan6", 32, "099999999", "dhtoan89@", 20));
        toan.displayEmployee(employeeArrayList);

        System.out.println("Xóa nhân viên");
        toan.removeEmployee(5);
        toan.displayEmployee(employeeArrayList);

        System.out.println("Sửa nhân viên");
        toan.changeEmployee(4, new PartTimeEmployee("005", "Toan5", 32, "09999999", "dhtoan89@", 6));
        toan.displayEmployee(employeeArrayList);

        System.out.println("Mức lương trung bình");
        System.out.println(toan.averageEmployee());

        System.out.println("Danh sách nhân viên Fulltime có mực lương thấp hơn lương trung bình");
        toan.displayEmployee(toan.FullTimeEmployeeLowerAvgSalary());

        System.out.println("Danh sách nhân viên PartTime");
        toan.displayEmployee(toan.showPartTimeEmployee());

        System.out.println("Tổng lương của nhân viên PartTime");
        System.out.println(toan.totalPartTiemEmployeeSalary());

        System.out.println("Sắp xếp nhân viên FullTime theo lương tăng dần");
        toan.displayEmployee(toan.sortFullTimeEmployeeSalaryAscending());
    }
}
