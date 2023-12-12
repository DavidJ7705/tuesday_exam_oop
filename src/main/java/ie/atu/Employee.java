package ie.atu;

public class Employee {
    String name;
    String idNumber;

    public Employee() {
    }

    public Employee(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void getReportDetails(){
        System.out.print("Name: "+getName());
        System.out.print("ID Number: "+getIdNumber());
    }
}
