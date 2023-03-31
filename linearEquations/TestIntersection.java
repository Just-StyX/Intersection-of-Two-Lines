package linearEquations;

import java.util.Scanner;

public class TestIntersection {
    public static void main(String[] args) {
        try (
                Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the four coordinates, e.g. x1, x2,....: ");
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();
            double x3 = input.nextDouble();
            double x4 = input.nextDouble();
            double x5 = input.nextDouble();
            double x6 = input.nextDouble();
            double x7 = input.nextDouble();
            double x8 = input.nextDouble();

            Intersection intersection = new Intersection(x1, x2, x3, x4, x5, x6, x7, x8);
            if (intersection.isSolved()) {
                System.out.println("The point of the intersection of the two lines is (" + intersection.solution()[0]
                        + ", " + intersection.solution()[1] + ")");
            } else {
                System.out.println("The determinant of the resulting matrix is " + intersection.getDeterminant()
                        + ". Hence the two lines do not intersect.");
            }
        }
    }
}
