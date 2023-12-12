package ie.atu;

public class ShiftSupervisor extends  ShiftWorker{
    private double annualSal;

    public ShiftSupervisor(int shift, int payrollNum, double hourRate, String name, String idNumber, double annualSal) {
        super(shift, payrollNum, hourRate, name, idNumber);
        this.annualSal = annualSal;
    }

    public ShiftSupervisor() {
        this.annualSal=10000;
    }

    public double getAnnualSal() {
        return annualSal;
    }

    public void setAnnualSal(double annualSal) {
        this.annualSal = annualSal;
    }
    public void getReportDetails () {
        System.out.println("\n\nName: " + getName());
        System.out.println("Payroll Number: " + getPayrollNum());
        System.out.println("Shift Number: " + getShift());
        System.out.print("Annual salary: " + getAnnualSal());
    }
}
