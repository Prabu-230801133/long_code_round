# Employee Payroll System

A console-based Employee Payroll System written in Java. It supports two user roles — **HR Manager** and **Finance Officer** — each with their own set of operations.

---

## Project Structure

```
src/
├── Employee.java               # Employee entity with salary delegation
├── Salary.java                 # Salary calculation logic
└── Employee_Payroll_System.java # Main entry point with menu-driven UI
```

---

## Classes

### `Employee`
Represents an employee with the following attributes:

| Field       | Type     | Description                        |
|-------------|----------|------------------------------------|
| `name`      | `String` | Employee's full name               |
| `id`        | `int`    | Auto-assigned unique employee ID   |
| `joinDate`  | `String` | Join date in `DD/MM/YYYY` format   |
| `CTC`       | `double` | Cost to Company (annual, in ₹)     |

Key methods:
- `displayEmployeeDetails()` – Prints employee info.
- `calculateSalary()` – Prints the full salary breakdown.
- `calculateTax()` – Prints the computed tax amount.
- `generatePayslip()` – Prints a formatted payslip.

---

### `Salary`
Handles all salary and tax computations for a given CTC.

**Salary breakdown:**

| Component          | Formula                              |
|--------------------|--------------------------------------|
| Basic Salary       | 50% of CTC                           |
| HRA                | 40% of Basic Salary                  |
| Special Allowance  | Basic Salary − HRA                   |
| PF (deduction)     | 12% of Basic Salary                  |
| ESI (deduction)    | 0.75% of Basic Salary                |
| Net Salary         | Basic + HRA + Special Allowance − (PF + ESI) |

**Tax slabs (based on CTC):**

| CTC Range (₹)          | Tax Rate |
|------------------------|----------|
| Up to 2,50,000         | 0%       |
| 2,50,001 – 5,00,000    | 5%       |
| 5,00,001 – 10,00,000   | 10%      |
| Above 10,00,000        | 20%      |

---

### `Employee_Payroll_System`
The main class. Provides a role-based menu loop.

**HR Manager menu:**
1. Add Employee
2. View Employee (by ID)
3. Add Employee to Payroll
4. Display All Employees
5. Logout

**Finance Officer menu:**
1. Calculate Salary (by ID)
2. Calculate Tax (by ID)
3. Generate Payslip (by ID)
4. Accept Payroll (processes all pending payroll entries)
5. Logout

---

## How to Compile and Run

**Prerequisites:** Java Development Kit (JDK) 8 or higher.

```bash
# Compile all source files into an output directory
javac src/*.java -d out

# Run the application
java -cp out Employee_Payroll_System
```

---

## Example Session

```
------Employee payroll system------

select user type:
1. HR Manager
2. Finance officer
3. Exit

Enter your option: 1

select from the below options:
1. Add Employee
2. View Employee
3. Add to payroll
4. Display all employees
5. Logout

Enter your option: 1

Enter employee name: Alice
Enter employee CTC(In Numbers): 800000
Enter employee join date(DD/MM/YYYY): 01/04/2024
Employee added successfully!
Employee ID: 1
```
