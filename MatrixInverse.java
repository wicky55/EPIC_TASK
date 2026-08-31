import java.util.Scanner;

public class MatrixInverse {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        System.out.println("Enter 2x2 matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];
        int determinant = (a * d) - (b * c);
        if (determinant == 0) {
            System.out.println("Inverse does not exist.");
        } else {

            double[][] inverse = new double[2][2];

            inverse[0][0] = (double) d / determinant;
            inverse[0][1] = (double) -b / determinant;
            inverse[1][0] = (double) -c / determinant;
            inverse[1][1] = (double) a / determinant;

            System.out.println("Inverse Matrix:");

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(inverse[i][j] + " ");
                }
                System.out.println();
            }
        }

        
    }
}