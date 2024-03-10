import java.util.Scanner;

public class QuadraticCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero. Exiting program.");
            return;
        }

        double delta = b * b - 4 * a * c;
        double x1, x2;

        switch (numberOfRoots(delta)) {
            case 0:
                System.out.println("No real roots.");
                break;
            case 1:
                x1 = -b / (2 * a);
                System.out.printf("One real root: x1 = %.2f%n", x1);
                break;
            case 2:
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Two real roots: x1 = %.2f, x2 = %.2f%n", x1, x2);
                break;
            default:
                System.out.println("Error in calculating roots.");
        }

    }

    public static int numberOfRoots(double delta) {
        if (delta < 0) {
            return 0;
        } else if (delta == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}

