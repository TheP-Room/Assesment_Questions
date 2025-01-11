package AssesmentOne_Advanced;

public class Main{
    public static void main(String[] args){
        SubClass subClass = new SubClass();
        try {
            subClass.showMessage();
            subClass.display();
        } catch (RuntimeException exception){
            System.out.println("Handled a UnChecked Exception");
        } catch (Exception exception){
            System.out.println("Handled a Checked Exception");
        }
    }
}
