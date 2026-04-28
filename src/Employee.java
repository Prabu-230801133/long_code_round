public class Employee {
    private String name;
    private int id;
    private String joinDate;
    private double CTC;
    Salary salary;


    public Employee(String name, int id,int CTC,String joinDate) {
        this.name = name;
        this.id = id;
        this.CTC=CTC;
        this.joinDate=joinDate;
        salary=new Salary(CTC);
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getCTC() {
        return (int) CTC;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public void calculateSalary() {
        System.out.println("Calculating salary for employee: "+name);
        salary.calculate();
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee CTC: "+CTC);
        System.out.println("Employee Join Date: "+joinDate);
    }
    public void calculateTax() {
        System.out.println("Calculating tax for employee: "+name);
        System.out.println("Tax: "+salary.getTax());;
    }
    public void generatePayslip() {
        System.out.println("Generating payslip for employee: "+name);
        System.out.println("------------------------------");
        salary.payslip();
        System.out.println("------------------------------");
    }

}
