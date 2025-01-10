package AssesmentTwo;
import java.util.Scanner;
public class FactorialCalculator {
    static Scanner sc = new Scanner(System.in);
    public static int calculateFactorial(){
        System.out.print("Number : ");
        int number = sc.nextInt();
        int result = 1;
        for (int i = 2; i<=number; i++){
            result *= i;
        }
        return result;
    }
}
