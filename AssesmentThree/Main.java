package AssesmentThree;

public class Main {
    public static void main(String[] args){
        Solid[] solids = {new Sphere(2), new Cuboid(2,3,5)};
        for (var i : solids){
            i.display();
        }
    }
}
