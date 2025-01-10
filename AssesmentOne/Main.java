package AssesmentOne;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        new EmployeeData(
                getEmployeeData("Work Quality"),
                getEmployeeData("Punctuality"),
                getEmployeeData("Teamwork"),
                getEmployeeData("Problem Solving"),
                getEmployeeData("Communication")
        );
    }
    public static int getEmployeeData(String scoreType){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter "+scoreType+" score for Employee (0 - 5) : ");
        return sc.nextInt();
    }
}
