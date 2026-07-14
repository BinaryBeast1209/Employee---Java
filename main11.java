import java.util.Scanner;

public class StaffSalaryMain {

    public static Staff readStaffDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Staff ID:");
        int staffId = sc.nextInt();

        System.out.println("Enter Staff Name:");
        String staffName = sc.next();

        System.out.println("Enter Basic Salary:");
        double basicSalary = sc.nextDouble();

        Staff staff = new Staff();
        staff.setId(staffId);
        staff.setName(staffName);
        staff.setSalary(basicSalary);

        return staff;
    }

    public static int readPF() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PF Percentage:");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        Staff staff = readStaffDetails();

        int pfPercentage = readPF();

        staff.calculateSalary(pfPercentage);

        System.out.println("Staff ID: " + staff.getId());
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Salary: " + staff.getSalary());
        System.out.println("Net Salary: " + staff.getNetSalary());
    }
}

class Staff {

    private int id;
    private String name;
    private double salary;
    private double netSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String staffName) {
        this.name = staffName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateSalary(int pf) {

        double pfAmount = (salary * pf) / 100;

        netSalary = salary - pfAmount;
    }
}
