package AssesmentFour_Advanced;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static int division(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static int getItem(int[] a, int n) throws ArrayIndexOutOfBoundsException{
        return a[n];
    }
    public static String getData(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        return reader.nextLine();
    }
    public static void handleExceptions(int[] list,File file){
        try {
            System.out.println(division(3,0));
            System.out.println(getItem(list,8));
            System.out.println(getData(file));
        } catch (ArithmeticException arithmeticException){
            System.out.println("Can't Divide by Zero");
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException){
            System.out.println("Index given is greater that array length");
        } catch (FileNotFoundException notFoundException){
            System.out.println("No Such file exists");
        } finally {
            System.out.println("Program END");
        }
    }
    public static void main(String[] args){
        int[] list = new int[5];
        list[0] = 1;
        list[1]=2;
        list[2]=3;
        list[3]=4;
        list[4]=5;
        File file = new File("Something.txt");
        handleExceptions(list,file);
    }
}
