package AssesmentFour;

public class Main {
    public static void main(String[] args){
        Employee employee_1 = new Employee();
        Employee employee_2 = new Employee("John","HR Manager",133_000);
        employee_1.displayEmployeeDetails();
        employee_2.displayEmployeeDetails();
    }
}
