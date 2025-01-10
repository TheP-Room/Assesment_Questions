package AssesmentFive;

public abstract class Student {
    private final String name;
    protected final double tutionFee;
    public Student(String name,double tutionFee){
        this.name = name;
        this.tutionFee = tutionFee;
        this.displayDetails();
    }
    public abstract double calculateScholarship();
    public void displayDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Tution Fee : $"+this.tutionFee);
    }
}
