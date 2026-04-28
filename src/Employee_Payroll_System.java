import java.util.*;
public class Employee_Payroll_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees=new ArrayList<>();
        List<Employee> payrolls=new ArrayList<>();
        int empid=1;

        while(true){
            System.out.println("\n------Employee payroll system------\n");
        System.out.println("select user type:\n1. HR Manager\n2. Finance officer\n3. Exit");
        System.out.print("\nEnter your option: ");
        int userType=scanner.nextInt();
        if(userType==1) {
            while (true) {
                System.out.println("select from the below options:\n");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employee");
                System.out.println("3. Add to payroll");
                System.out.println("4. Display all employees");
                System.out.println("5. Logout");
                System.out.print("\nEnter your option: ");
                int option = scanner.nextInt();
                try {
                    switch (option) {
                        case 1:
                            System.out.print("\nEnter employee name:");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            int id = empid++;
                            System.out.print("Enter employee CTC(In Numbers):");
                            int CTC = scanner.nextInt();
                            System.out.print("Enter employee join date(DD/MM/YYYY):");
                            String joinDate = scanner.next();
                            Employee employee = new Employee(name, id, CTC, joinDate);
                            employees.add(employee);
                            System.out.println("Employee added successfully!\nEmployee ID: " + id);
                            break;
                        case 2:
                            int viewId;
                            System.out.print("\nEnter employee id to view:");
                            viewId = scanner.nextInt();
                            boolean isPresent3 = false;

                            for (Employee e : employees) {
                                isPresent3 = true;
                                if (e.getId() == viewId) {
                                    System.out.println("\nEmployee details:\n");
                                    e.displayEmployeeDetails();
                                }
                            }
                            if (!isPresent3) {
                                System.out.println("\nEmployee with ID " + viewId + " not found.\n");
                            }
                            break;
                        case 3:
                            int salaryId;
                            System.out.print("\nEnter employee id to add to Payroll:");
                            salaryId = scanner.nextInt();
                            boolean isPresent = false;
                            for (Employee e : employees) {
                                if (e.getId() == salaryId) {
                                    isPresent = true;
                                    payrolls.add(e);
                                    System.out.println("\nEmployee with ID " + salaryId + " added to Payroll.\n");
                                }
                            }
                            if (!isPresent) {
                                System.out.println("\nEmployee with ID " + salaryId + " not found.\n");
                            }
                            break;

                        case 4:
                            System.out.println("\nAll Employees:");
                            for (Employee e : employees) {
                                e.displayEmployeeDetails();
                                System.out.println("-------------------");
                            }
                            break;
                        case 5:
                            System.out.println("Logging out...");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                    if(option==5){
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid option.");
                    scanner.nextLine();
                }
            }
        } else if (userType==2){
            while(true){
                System.out.println("select from the below options:\n");
                System.out.println("1. Calculate Salary");
                System.out.println("2. Calculate Tax");
                System.out.println("3. payslip");
                System.out.println("4. accept payroll");
                System.out.println("5. Logout");
                System.out.print("\nEnter your option: ");
                int option = scanner.nextInt();
                try {
                    switch (option) {
                        case 1:
                            int salaryId;
                            System.out.print("\nEnter employee id to calculate salary:");
                            salaryId = scanner.nextInt();
                            boolean isPresent = false;
                            for (Employee e : employees) {
                                if (e.getId() == salaryId) {
                                    isPresent = true;
                                    System.out.println("\n");
                                    e.calculateSalary();
                                }
                            }
                            if (!isPresent) {
                                System.out.println("\nEmployee with ID " + salaryId + " not found in payroll.\n");
                            }
                            break;
                        case 2:
                            int taxId;
                            System.out.print("\nEnter employee id to calculate tax:");
                            taxId = scanner.nextInt();
                            boolean isPresent2 = false;
                            for (Employee e : employees) {
                                if (e.getId() == taxId) {
                                    isPresent2 = true;
                                    e.calculateTax();
                                }
                            }
                            if (!isPresent2) {
                                System.out.println("\nEmployee with ID " + taxId + " not found in payroll.\n");
                            }
                            break;
                        case 3:
                            int payslipId;
                            System.out.print("\nEnter employee id to generate payslip:");
                            payslipId = scanner.nextInt();
                            boolean isPresent3 = false;
                            for (Employee e : employees) {
                                if (e.getId() == payslipId) {
                                    isPresent3 = true;
                                    System.out.println("\nPayslip for Employee ID: " + payslipId);
                                    e.generatePayslip();
                                }
                            }
                            if (!isPresent3) {
                                System.out.println("\nEmployee with ID " + payslipId + " not found in payroll.\n");
                            }
                            break;
                        case 4:
                            System.out.println("\nAccepting payroll...");
                            for(Employee e:payrolls){
                                System.out.println("Payroll accepted for Employee ID: "+e.getId());
                                System.out.println("salary: "+e.getCTC()+"is transferred to Employee : "+e.getName());
                            }
                            payrolls.clear();
                            break;
                        case 5:
                            System.out.println("Logging out...");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                    if(option==5) {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid option.");
                    scanner.nextLine();
                }
            }

        }else if(userType==3){
            System.out.println("Exiting...");
            return;
        }else {
            System.out.println("Invalid user type! Please try again.");
        }

    }
}
}
