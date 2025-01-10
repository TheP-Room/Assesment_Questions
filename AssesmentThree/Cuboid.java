package AssesmentThree;

public class Cuboid extends Solid{
    private final double length;
    private final double breadth;
    private final double height;
    public Cuboid(double length,double breadth,double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        System.out.println("Volume of Cuboid : "+volume());
        System.out.println("Surface Area of Cuboid : "+surfaceArea());
    }
    @Override
    public double volume(){
        return this.length*this.breadth*this.height;
    }
    @Override
    public double surfaceArea(){
        return 2*((this.length*this.breadth)+
                (this.length*this.height)+
                (this.breadth*this.height));
    }
}
