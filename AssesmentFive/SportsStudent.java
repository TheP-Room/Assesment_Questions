package AssesmentFive;

public class SportsStudent extends Student{
    private final String extraCurricularRating;
    public SportsStudent(String name,double tutionFee,String extraCurricularRating){
        super(name,tutionFee);
        this.extraCurricularRating = extraCurricularRating;
        System.out.println("Scholarship amount : $"+this.calculateScholarship());
    }
    @Override
    public double calculateScholarship(){
        if(this.tutionFee >= 1_000 && this.extraCurricularRating.equals("A")){
            return 100;
        } else {
            return 0;
        }
    }
}
