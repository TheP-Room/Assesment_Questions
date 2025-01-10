package AssesmentFive;

public class MeritStudent extends Student{
    public MeritStudent(String name,double tutionFee){
        super(name,tutionFee);
        System.out.println("Scholarship amount : $"+this.calculateScholarship());
    }
    @Override
    public double calculateScholarship(){
        if(this.tutionFee >= 1_000){
            return 100;
        } else {
            return 0;
        }
    }
}
