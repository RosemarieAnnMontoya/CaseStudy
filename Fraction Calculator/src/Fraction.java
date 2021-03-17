import java.util.InputMismatchException;
public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int num, int den){
        if (den==0){
            throw new IllegalArgumentException("not possible to use denominator zero");
        } else if (den<0){
            this.numerator=num*-1;
            this.denominator=den*-1;
        } else{
            this.numerator=num;
            this.denominator=den;
        }
    }
    public Fraction(int num){
        this(num,1);
    }
    public Fraction(){ 
        this(0);
    }


    public int getNumerator(){ 
        return numerator;
    }
    public int getDenominator(){ 
        return denominator;
    }
    public String toString(){ 
        return numerator+"/"+denominator;
    }
    public double toDouble(){ 
        return numerator/denominator;
    }
    public Fraction add(Fraction other){
        Fraction newFrac= new Fraction(((this.numerator*other.denominator)+(other.numerator*this.denominator)),(this.denominator*other.denominator));
        newFrac.toLowestTerms();
        return newFrac;
    }
    public Fraction subtract(Fraction other){ 
        Fraction newFrac= new Fraction(((this.numerator*other.denominator)-(other.numerator*this.denominator)),(this.denominator*other.denominator));
        newFrac.toLowestTerms();
        return newFrac;
    }
    public Fraction multiply(Fraction other){
        Fraction newFrac= new Fraction((this.numerator*other.numerator),(this.denominator*other.denominator));
        newFrac.toLowestTerms();
        return newFrac;
    }
    public Fraction divide(Fraction other){ 
        if (other.numerator==0){
            throw new IllegalArgumentException();
        } else {
            Fraction newFrac= new Fraction((this.numerator*other.denominator),(this.denominator*other.numerator));
            newFrac.toLowestTerms();
            return newFrac;
        }
    }
    public boolean equals(Object other){
        if (other instanceof Fraction){
            Fraction otherNew= (Fraction) other;
            otherNew.toLowestTerms();
            Fraction thisFrac= new Fraction(this.numerator,this.denominator);
            thisFrac.toLowestTerms();
            return (thisFrac.numerator==otherNew.numerator) && (thisFrac.denominator==otherNew.denominator);
        } else{//if object not Fraction
            throw new  InputMismatchException("Fraction expected.");
        }
    }
    void toLowestTerms() { 
        int gcd=gcd(this.numerator,this.denominator);
        numerator=this.numerator/gcd;
        denominator=this.denominator/gcd;
    }
    private static int gcd(int num, int den){ 
        while (num!=0&&den!=0){
            int remainder=num%den;
            num=den;
            den=remainder;
        }
        return num;
    }
}