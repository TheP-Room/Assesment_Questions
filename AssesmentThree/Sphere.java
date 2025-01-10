package AssesmentThree;

public class Sphere extends Solid{
    private final int radius;
    public Sphere(int radius){
        this.radius = radius;
        System.out.println("Volume of Sphere : "+volume());
        System.out.println("Surface Area of Sphere : "+surfaceArea());
    }
    @Override
    public double volume(){
        return (double)(4/3)*3.14*(this.radius*this.radius*this.radius);
    }
    @Override
    public double surfaceArea(){
        return 4*3.14*(this.radius*this.radius);
    }
}
