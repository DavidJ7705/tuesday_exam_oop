package ie.atu;

public class ShiftWorker extends Employee{
        private int shift;
        private int payrollNum;
        private double hourRate;


    public ShiftWorker() {
        int shift = Integer.parseInt("1");
        int payrollNum = Integer.parseInt("10");
        double hourRate = Double.parseDouble("0.2");
    }


    public ShiftWorker( int shift, int payrollNum, double hourRate, String name, String idNumber){
        super(name, idNumber);
        this.shift = shift;
        this.payrollNum = payrollNum;
        this.hourRate = hourRate;
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

        public void setHourRate ( double hourRate){
        this.hourRate = hourRate;
    }
        public void getReportDetails () {
        System.out.println("Name: " + getName());
        System.out.println("Payroll Number: " + getPayrollNum());
        System.out.println("Shift Number: " + getShift());
        System.out.print("Hourly Pay Rate: " + getHourRate());
    }

        public void setPayrollNum () {
    }


        public void setShift () {
    }

        public void setHourRate () {
    }
}
