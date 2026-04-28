public class Salary {
    private final double CTC;
    private final int HRA;
    private final int PF;
    private final int ESI;
    private final int specialAllowance;
    private final double basicsalary;
    private final double netSalary;
    private double total_deductions;
    private double tax;

    public Salary(int CTC) {
        this.basicsalary = (int)(0.5*CTC);
        this.CTC=CTC;
        this.HRA=(int)(0.4*basicsalary);
        this.specialAllowance=(int) basicsalary-HRA;
        this.PF=(int)(0.12*basicsalary);
        this.ESI=(int)(0.0075*basicsalary);
        this.total_deductions=PF+ESI;
        calculateAllTax();
        this.netSalary=basicsalary+HRA+specialAllowance-total_deductions;
    }

    public void calculate() {
        System.out.println("Gross Salary: "+this.CTC);
        System.out.println("------------------------------");
        System.out.println("Basic Salary: "+this.basicsalary);
        System.out.println("HRA: "+this.HRA);
        System.out.println("Special Allowance: "+this.specialAllowance);
        System.out.println("TDS: "+this.total_deductions);
        System.out.println("------------------------------");
        System.out.println("Net Salary: "+this.netSalary);
    }
    public int getTax() {
        return (int) tax;
    }
    private void calculateAllTax(){
        if(CTC<=250000){
            tax=0;
        }
        else if(CTC>250000 && CTC<=500000){
            tax=0.05*CTC;
        }
        else if(CTC>500000 && CTC<=1000000){
            tax=0.1*CTC;
        }
        else {
            tax = 0.2 * CTC;
        }
    }
    void payslip() {;
        System.out.println("Gross Salary: "+this.CTC);
        System.out.println("------------------------------");
        System.out.println("Basic Salary: "+this.basicsalary);
        System.out.println("HRA: "+this.HRA);
        System.out.println("Special Allowance: "+this.specialAllowance);
        System.out.println("TDS: "+this.total_deductions);
        System.out.println("------------------------------");
        System.out.println("Net Salary: "+this.netSalary);
    }


}
