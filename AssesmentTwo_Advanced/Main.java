package AssesmentTwo_Advanced;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Rows for Matrix 1 : ");
        int row = sc.nextByte();
        System.out.print("No of Cols for Matrix 1 : ");
        int col = sc.nextByte();
        int[][] matrixOne = new int[row][col];
        System.out.print("No of Rows for Matrix 2 : ");
        int row1 = sc.nextByte();
        System.out.print("No of Cols for Matrix 2 : ");
        int col1 = sc.nextByte();
        int[][] matrixTwo = new int[row1][col1];
        try {
            if(row != row1 || col != col1){
                throw new RuntimeException();
            } else {
                System.out.println("Input Values for Matrix 1 : ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(i+","+j+": ");
                        matrixOne[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Input Values for Matrix 2 : ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(i+","+j+": ");
                        matrixTwo[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Matrix 1 : ");
                for(int i = 0; i<row; i++){
                    for(int j = 0; j<col; j++){
                        System.out.print(matrixOne[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println("Matrix 2 : ");
                for(int i = 0; i<row; i++){
                    for(int j = 0; j<col; j++){
                        System.out.print(matrixTwo[i][j]+" ");
                    }
                    System.out.println();
                }
                int[][] matrixAdd = new int[row][col];
                System.out.println("Sum of Matrices : ");
                for (int i = 0; i<row; i++){
                    for (int j = 0; j<col; j++){
                        matrixAdd[i][j] = matrixOne[i][j]+matrixTwo[i][j];
                    }
                }
                for (int i = 0; i<row; i++){
                    for (int j = 0; j<col; j++){
                        System.out.print(matrixAdd[i][j]+" ");
                    }
                    System.out.println();
                }
            }

        } catch (RuntimeException runtimeException){
            System.out.println("Rows and Cols for both matrices must be equal.");
        }
    }
}
