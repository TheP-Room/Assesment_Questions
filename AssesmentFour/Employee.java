package AssesmentFour;

public class Employee {
    private final String name;
    private final String position;
    private final double salary;
    public Employee(){
        this.name = "Unknown";
        this.position = "Unassigned";
        this.salary = 0.0;
        System.out.println("No Argument Constructor Called");
    }
    public Employee(String name,String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println("Argumented Constructor Called");
    }
    public void displayEmployeeDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Position : "+this.position);
        System.out.println("Salary : $"+this.salary);
    }
}
