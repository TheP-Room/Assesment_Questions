package AssesmentFive;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int value = getInput();
        while (value != 0){
            value = getInput();
        }
    }
    public static int getInput(){
        System.out.println("0 - Merit, 1 - Sports, 3 - Exit");
        System.out.print("Choice : ");
        int choice1 = sc.nextInt();
        switch (choice1){
            case 0:
                System.out.print("Name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Tution Fee : ");
                int tutionFee = sc.nextInt();
                new MeritStudent(name,tutionFee);
                return 1;
            case 1:
                System.out.print("Name : ");
                sc.nextLine();
                String namE = sc.nextLine();
                System.out.print("Tution Fee : ");
                int tutionFeE = sc.nextInt();
                System.out.print("Extra Curricular Rating A or B : ");
                String extraCurricularRating = sc.next();
                new SportsStudent(namE,tutionFeE,extraCurricularRating);
                return 1;
            default:
                System.out.println("Exiting.");
                return 0;
        }
    }
}
