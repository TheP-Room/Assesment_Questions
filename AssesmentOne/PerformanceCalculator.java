package AssesmentOne;

public abstract class PerformanceCalculator {
    private final float OVERALLPERCENTAGE;
    public PerformanceCalculator(int workQualityScore,
                                 int punctualityScore,
                                 int teamworkScore,
                                 int problemSolvingScore,
                                 int communicationScore){
        this.OVERALLPERCENTAGE = (workQualityScore +punctualityScore +teamworkScore +
                        problemSolvingScore +communicationScore
                )*4;
        System.out.println(performanceLevel());
    }
    public String performanceLevel(){
        return (this.OVERALLPERCENTAGE >= 90) ? "Outstanding"
                : (this.OVERALLPERCENTAGE >= 80) ? "Excellent"
                : (this.OVERALLPERCENTAGE >= 70) ? "Good"
                : (this.OVERALLPERCENTAGE >= 60) ? "Average"
                : (this.OVERALLPERCENTAGE >=50) ? "Below Average"
                : "Unsatisfactory";
    }
}
