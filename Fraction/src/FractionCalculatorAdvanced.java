import java.util.Scanner;
public class FractionCalculatorAdvanced {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" \t NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        System.out.println(" \t NN                                                   NN");
        System.out.println(" \t NN         FRACTION CALCULATOR ADVANCED              NN");
        System.out.println(" \t NN                                                   NN");
        System.out.println(" \t NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        System.out.println();
        System.out.println(" \t   This program allows the user to perform standard");
        System.out.println(" \t   mathematical functions on regular fractions. It");
        System.out.println(" \t   add, subtract, multiply and divide fractions until");
        System.out.println(" \t   you type Q to quit.");
        System.out.println();
        System.out.println("Valid operations are of the form \"[FRAC] [OPERATION] [FRAC]\".");
        System.out.println("[FRAC] can be either a single integer or two integers separated by \"/\".");
        System.out.println("[OPERATION] can be +, -, *, / or =.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        int quit = 0;
        while (quit == 0) {
            System.out.print("Please enter your fractional computation (Q to quit): ");
            String convolute = input.nextLine();
            if (convolute.equalsIgnoreCase("q")) { quit = 1; continue; }
            int exit = 0;
            while (exit == 0) {
                convolute = verifyInput(convolute);
                String[] choppy = convolute.split(" ");
                String elem1 = choppy[0];
                String elem2 = choppy[1];
                String elem3 = choppy[2];
                if (!(validFraction(elem1))) {
                    System.out.print("Your first element is not a typical fraction. Please use integer form a/b or a. Re-type full operation: ");
                    convolute = input.nextLine();
                    continue;
                }
                if (!(validOperator(elem2))) {
                    System.out.print("Your operator must be: +, -, /, *, =. Please re-enter your whole equation: ");
                    convolute = input.nextLine();
                    continue;
                }
                if (!(validFraction(elem3))) {
                    System.out.print("Your third element is not a typical fraction. Please use integer form a/b or a. Re-type full operation: ");
                    convolute = input.nextLine();
                    continue;
                }
                exit = 1;
            }
            String[] choppy = convolute.split(" ");
            if (!(choppy[0].contains("/"))) { choppy[0] = choppy[0] + "/1"; }
            if (!(choppy[2].contains("/"))) { choppy[2] = choppy[2] + "/1"; }
            String[] finechop = choppy[0].split("/");
            int[] frac1 = new int[2];
            frac1[0] = Integer.parseInt(finechop[0]);
            frac1[1] = Integer.parseInt(finechop[1]);
            Fraction fraction1 = new Fraction(frac1[0], frac1[1]);
            finechop = choppy[2].split("/");
            int[] frac2 = new int[2];
            frac2[0] = Integer.parseInt(finechop[0]);
            frac2[1] = Integer.parseInt(finechop[1]);
            Fraction fraction2 = new Fraction(frac2[0], frac2[1]);
            if (choppy[1].equals("+")) {
                Fraction sum = fraction1.add(fraction2);
                System.out.print(fraction1.toString() + " + " + fraction2.toString() + " = " + sum.toString());
                Fraction sumLow = new Fraction(sum.getNumerator(), sum.getDenominator());
                sumLow.toLowestTerms();
                if (!(sum.toString().equals(sumLow.toString()))) { System.out.print(" -> " + sumLow.toString()); }
                System.out.print("\n");
            } else if (choppy[1].equals("-")) {
                Fraction rem = fraction1.subtract(fraction2);
                System.out.println(fraction1.toString() + " - " + fraction2.toString() + " = " + rem.toString());
                Fraction remLow = new Fraction(rem.getNumerator(), rem.getDenominator());
                remLow.toLowestTerms();
                if (!(rem.toString().equals(remLow.toString()))) { System.out.print(" -> " + remLow.toString()); }
                System.out.print("\n");
            } else if (choppy[1].equals("/")) {
                Fraction quotient = fraction1.divide(fraction2);
                System.out.println(fraction1.toString() + " / " + fraction2.toString() + " = " + quotient.toString());
                Fraction quoLow = new Fraction(quotient.getNumerator(), quotient.getDenominator());
                quoLow.

    private static String verifyInput(String convolute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean validFraction(String elem1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean validOperator(String elem2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
