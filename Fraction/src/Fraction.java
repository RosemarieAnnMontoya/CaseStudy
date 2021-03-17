import java.lang.Class;
import java.util.InputMismatchException;
public class Fraction {
    private int n = 0;
    private int d = 0;
    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
        if (this.d == 0) { throw new IllegalArgumentException(); }
        else {
            if (this.d < 0) {
                this.d = this.d * (-1);
                this.n = this.n * (-1);
            }
        }
    }
    public Fraction(int n) {
        this.n = n;
        this.d = 1;
    }
    public Fraction() {
        this.n = 0;
        this.d = 1;
    }
    public int getNumerator() {
        return this.n;
    }
    public int getDenominator() {
        return this.d;
    }
    public String toString() {
        return this.n + "/" + this.d;
    }
    public double toDouble() {
        return this.n / this.d;
    }
    public Fraction add(Fraction other) {
        int lcd = lcd(this.d, other.d);
        Fraction frac1 = new Fraction(this.n, this.d);
        Fraction frac2 = new Fraction(other.n, other.d);
        if (frac1.d < lcd) {
            int m = lcd / frac1.d;
            frac1.n = frac1.n * m;
            frac1.d = lcd;
        }
        if (frac2.d < lcd) {
            int m = lcd / frac2.d;
            frac2.n = frac2.n * m;
            frac2.d = lcd;
        }
        Fraction sum = new Fraction((frac1.n + frac2.n), lcd);
        return sum;
    }
    public Fraction subtract(Fraction other) {
        int lcd = lcd(this.d, other.d);
        Fraction frac1 = new Fraction(this.n, this.d);
        Fraction frac2 = new Fraction(other.n, other.d);
        if (frac1.d < lcd) {
            int m = lcd / frac1.d;
            frac1.n = frac1.n * m;
            frac1.d = lcd;
        }
        if (frac2.d < lcd) {
            int m = lcd / frac2.d;
            frac2.n = frac2.n * m;
            frac2.d = lcd;
        }
        Fraction sum = new Fraction((frac1.n - frac2.n), lcd);
        return sum;
    }
    public Fraction multiply(Fraction other) {
        Fraction frac1 = new Fraction(this.n, this.d);
        Fraction frac2 = new Fraction(other.n, other.d);
        int t = frac1.n * frac2.n;
        int b = frac1.d * frac2.d;
        Fraction product = new Fraction(t, b);
        return product;
    }
    public Fraction divide(Fraction other) {
        Fraction frac1 = new Fraction(this.n, this.d);
        Fraction frac2 = new Fraction(other.n, other.d);
        if ((frac1.n == 0) || (frac1.d == 0) || (frac2.n == 0) || (frac2.d == 0)) {
            throw new IllegalArgumentException();
        }
        int t = frac1.n * frac2.d;
        int b = frac1.d * frac2.n;
        Fraction quotient = new Fraction(t, b);
        return quotient;
    }
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction frac2 = (Fraction)other;
            Fraction frac1 = new Fraction(this.n, this.d);
            frac1.toLowestTerms();
            frac2.toLowestTerms();
            if ((frac1.n == frac2.n) && (frac1.d == frac2.d)) { return true; }
            else { return false; }
        } else {
            throw new InputMismatchException();
        }
    }
    public void toLowestTerms() {
        int gcd = gcd(this.n, this.d);
        int t = this.n / gcd;
        int b = this.d / gcd;
        this.n = t;
        this.d = b;
    }
    private static int gcd(int num, int den) {
        if (den == 0) {
            return num;
        }
        return gcd(den, num%den);
    }
    private static int lcd(int int1, int int2) {
        int m1, m2, h, ht, l, lt;
        m1 = m2 = h = ht = l = lt = 0;
        if (int1 > int2) { h = int1; ht = int1; l = int2; lt = int2; } else { h = int2; ht = int2; l = int1; lt = int1; }
        while (ht != lt) {
            m1++;
            ht = h * m1;
            while (lt < ht ) {
                m2++;
                lt = l * m2;
            }
        }
        return ht;
    }
}