import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {

        if (args.length == 0) interactive();
        else {
            String filePath = args[0];
            nonInteractive(filePath);
        }
    }

    public static void nonInteractive(String filePath) {
        double a = 0, b = 0, c = 0;

        try (Scanner fileScanner = new Scanner(new File(filePath)).useLocale(Locale.US)) {
            a = fileScanner.nextDouble();
            b = fileScanner.nextDouble();
            c = fileScanner.nextDouble();
            String next = fileScanner.nextLine();
            if (fileScanner.hasNextLine() || !next.equals("")) throw new Exception();
            if (a == 0) System.out.println("Error. Parameter a can't be a zero");
        } catch (FileNotFoundException e) {
            System.out.println("File " + filePath + " does not exist");
            System.exit(1);
        }
        catch (Exception e) {
            System.out.println("Invalid file format");
            System.exit(1);
        }
        solve(a, b, c);
    }

    public static void interactive() {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        while (true) {
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
        }

        while (true) {
            System.out.print("b = ");
            try {
                b = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Expected a valid real number, got " + input.nextLine() + " instead");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("c = ");
            try {
                c = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Expected a valid real number, got " + input.nextLine() + " instead");
                continue;
            }
            break;
        }
        solve(a, b, c);
    }

    public static void solve(double a, double b, double c) {

        System.out.println("Equation is: (" + a + ") x^2 + (" + b + ") + (" + c + ") = 0");

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