//package QuadraticEquationSolver;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();

        System.out.println("Equation is: (" + a + ") x^2 + ("+ b +  ") + ("+  c + ") = 0");

        ArrayList<Double> roots = new ArrayList<>();
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