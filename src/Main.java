import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of row and column of array: ");
        int numRow = scanner.nextInt();
        int[][] array = new int[numRow][numRow];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
                System.out.print(array[i][j] + "\t");
                if (i == j) {
                    sum += array[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("Sum of numbers at the main diagonal of square matrix is: " + sum);
    }

    public static int randomNumber() {
        return (int) Math.floor((Math.random() * 90) + 10);
    }
}