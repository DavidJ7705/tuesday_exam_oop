package ie.atu;

public class Employee {
    String name;
    String idNumber;

    public Employee(){
        this.name = "David";
        this.idNumber= "G004";
    }
    public Employee(String name,String idNumber) {
        this.name = name;
        this.idNumber =idNumber ;
    }


    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber() {
        this.idNumber = idNumber;
    }

    public void getReportDetails(){
        System.out.println("Name: "+getName());
        System.out.println("ID Number: "+getIdNumber());
    }
}
