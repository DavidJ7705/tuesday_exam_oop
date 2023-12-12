package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EmployeeApp {
    public static void main(String[] args) {
        Employee user=new Employee();
        user.setName();
        user.setIdNumber();
        user.getReportDetails();


        ShiftWorker user_2 = new ShiftWorker();
        user.setName();
        user_2.setPayrollNum();
        user_2.setShift();
        user_2.setHourRate();
        user_2.getReportDetails();

        ShiftWorker user_3 = new ShiftSupervisor();
        user.setName();
        user_3.setPayrollNum();
        user_3.setShift();
        user_3.getReportDetails();
    }
}