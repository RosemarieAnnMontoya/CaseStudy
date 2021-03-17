import java.util.Scanner;
public class FractionCalculator {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" \t NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        System.out.println(" \t NN                                                   NN");
        System.out.println(" \t NN                FRACTION CALCULATOR                NN");
        System.out.println(" \t NN                                                   NN");
        System.out.println(" \t NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        System.out.println();
        System.out.println(" \t   This program allows the user to perform standard");
        System.out.println(" \t   mathematical functions on regular fractions. It");
        System.out.println(" \t   add, subtract, multiply and divide fractions until");
        System.out.println(" \t   you type Q to quit.");
        System.out.println();
        System.out.println("Please enter your fractions in the form a/b, where a and b are integers.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        int i = 0;
        do {
            String operation = getOperation();
            Fraction frac1 = getFraction();
            Fraction frac2 = getFraction();
            if (operation.equals("+")) {
                Fraction sum = frac1.add(frac2);
                System.out.print(frac1.toString() + " + " + frac2.toString() + " = " + sum.toString());
                Fraction sumLow = new Fraction(sum.getNumerator(), sum.getDenominator());
                sumLow.toLowestTerms();
                if (!(sum.toString().equals(sumLow.toString()))) { System.out.print(" -> " + sumLow.toString()); }
                System.out.print("\n");
            } else if (operation.equals("-")) {
                Fraction rem = frac1.subtract(frac2);
                System.out.println(frac1.toString() + " - " + frac2.toString() + " = " + rem.toString());
                Fraction remLow = new Fraction(rem.getNumerator(), rem.getDenominator());
                remLow.toLowestTerms();
                if (!(rem.toString().equals(remLow.toString()))) { System.out.print(" -> " + remLow.toString()); }
                System.out.print("\n");
            } else if (operation.equals("/")) {
                Fraction quotient = frac1.divide(frac2);
                System.out.println(frac1.toString() + " / " + frac2.toString() + " = " + quotient.toString());
                Fraction quoLow = new Fraction(quotient.getNumerator(), quotient.getDenominator());
                quoLow.toLowestTerms();
                if (!(quotient.toString().equals(quoLow.toString()))) { System.out.print(" -> " + quoLow.toString()); }
                System.out.print("\n");
            } else if (operation.equals("*")) {
                Fraction product = frac1.multiply(frac2);
                System.out.println(frac1.toString() + " * " + frac2.toString() + " = " + product.toString());
                Fraction pdtLow = new Fraction(product.getNumerator(), product.getDenominator());
                pdtLow.toLowestTerms();
                if (!(product.toString().equals(pdtLow.toString()))) { System.out.print(" -> " + pdtLow.toString()); }
                System.out.print("\n");
            } else {
                boolean answer = frac1.equals(frac2);
                System.out.println(frac1.toString() + " = " + frac2.toString() + " is " + answer);
            }
            System.out.println("-------------------------------------------------------------------------");
        } while (i == 0);
    }
    public static String getOperation() {
        System.out.print("Please enter an operation (+, -, /, *, = or Q to quit): ");
        String perform = input.nextLine();
        if (!(perform.equals("+")) && !(perform.equals("-")) && !(perform.equals("/")) && !(perform.equals("*")) && !(perform.equals("=")) && !(perform.equalsIgnoreCase("Q"))) {
            while (!(perform.equals("+")) && !(perform.equals("-")) && !(perform.equals("/")) && !(perform.equals("*")) && !(perform.equals("=")) && !(perform.equalsIgnoreCase("Q"))) {
                System.out.print("Invalid input (+, -, /, *, = or Q to quit): ");
                perform = input.nextLine();
            }
        }
        if (perform.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        return perform;
    }
    public static boolean validFraction(String check) {
        if (check.contains("/")) {
            String[] data = check.split("/");
            if (data[0].matches("-?\\d+")) {
                if (data[1].matches("-?\\d+")) {
                    int data1 = Integer.parseInt(data[1]);
                    if (data1 > 0) {
                        return true;
                    } else { 
                        return false;
                    }