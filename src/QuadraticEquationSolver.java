import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        ArrayList<Double> roots = new ArrayList<>();

        while(true) {
            System.out.print("a = ");
            try {
                a = input.nextDouble();
                if (a == 0) {
                    System.out.println("Error. Parameter a can't be a zero");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Expected a valid real number, got " + input.nextLine() + " instead");
                continue;
            }
            break;
        };

        while (true) {
            System.out.print("b = ");
            try {
                b = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Expected a valid real number, got " + input.nextLine() + " instead");
                continue;
            }
            break;
        };

        while (true) {
            System.out.print("c = ");
            try {
                c = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Expected a valid real number, got " + input.nextLine() + " instead");
                continue;
            }
            break;
        };

        System.out.println("Equation is: (" + a + ") x^2 + ("+ b +  ") + ("+  c + ") = 0");

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double x = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots.add(x);
            x = (-b - Math.sqrt(discriminant)) / (2 * a);
            if (roots.get(0) != x) roots.add(x);
        }
        System.out.printf("There are %d roots\n", roots.size());
        for (int i = 0; i < roots.size(); i++) {
            Double element = roots.get(i);
            System.out.println("x" + (i + 1) + " = " + element);
        }
    }
}