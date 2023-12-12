package ie.atu;

public class ShiftWorker extends Employee{
        private int shift;
        private int payrollNum;
        private double hourRate;


    public ShiftWorker(int shift, int payrollNum, double hourRate, String name, String idNumber) {

        super(name, idNumber);
        this.shift = shift;
        this.payrollNum = payrollNum;
        this.hourRate = hourRate;
    }

    public ShiftWorker() {
        this.payrollNum=10;
        this.shift=1;
        this.hourRate=0.2;
    }

    public int getShift () {
        return shift;
    }

        public void setShift ( int shift){
        this.shift = shift;
    }

        public int getPayrollNum () {
        return payrollNum;
    }

        public void setPayrollNum ( int payrollNum){
        this.payrollNum = payrollNum;
    }

        public double getHourRate () {
        return hourRate;
    }
    public void setPayrollNum() {
        this.payrollNum=payrollNum;
    }

    public void setShift() {
        this.shift=shift;
    }

    public void setHourRate() {
        this.hourRate=hourRate;
    }
        public void setHourRate ( double hourRate){
        this.hourRate = hourRate;
    }
        public void getReportDetails () {
        System.out.println("\nName: " + getName());
        System.out.println("Payroll Number: " + getPayrollNum());
        System.out.println("Shift Number: " + getShift());
        System.out.print("Hourly Pay Rate: " + getHourRate());
    }

}
