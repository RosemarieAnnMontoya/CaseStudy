import java.util.Scanner;
public class FractionCalculator {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        intro();
        while(true){
            String operation=getOperation();
            Fraction frac1= getFraction();
            Fraction frac2= getFraction();
            Fraction result= new Fraction (1,1);
            String result2="";
            if (operation.equals("=")){
                System.out.println(frac1+" "+operation+" "+frac2+" is "+frac1.equals(frac2));
            } else{
                if (operation.equals("+")){
                    result=frac1.add(frac2);
                } else if (operation.equals("-")) {
                    result = frac1.subtract(frac2);
                }else if (operation.equals("/")) {
                    if(frac2.getNumerator()==0){
                        result2="Undefined";
                    }else{
                        result = frac1.divide(frac2);
                    }
                }else if (operation.equals("*")) {
                    if(frac2.getNumerator()==0){
                        result2="0";
                    }else{
                        result = frac1.multiply(frac2);
                    }
                }
                 if (result2!="") {
                    System.out.println(frac1+" "+operation+" "+"0"+" = "+result2);
                } else if (result.getNumerator()%result.getDenominator()==0){
                    System.out.println(frac1+" "+operation+" "+frac2+" = "+(result.getNumerator()/result.getDenominator()));
                } else{
                    System.out.println(frac1+" "+operation+" "+frac2+" = "+result.toString());
                }
            }
        }
    }
    public static void intro (){
        System.out.println("This program is a Fraction Calculator.");
        System.out.println("Fraction Calculator can Add, Subtract, Multiply and Divide fractions until you type \"L\" to leave.");
        System.out.println("Please enter your fraction in the form x/y, where x and y are integers,and y is greater than zero.");
        System.out.println("______________________________________________________________");
    }
    public static String getOperation() { 
        System.out.print("Please enter an operation (+,-,/,*,=) or \"L\" to leave: ");
        String operation = input.nextLine();
        int x = 0;
        while (x == 0) {
            if (operation.equalsIgnoreCase("e")) {
                System.exit(0);
            } else if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("=")){
                x++;
            } else{
                System.out.print("Invalid input, enter a valid operation (+,-,/,*,=) or \"L\" to leave: ");
                operation = input.nextLine();
            }
        }
        return operation;
    }
    public static Fraction getFraction(){ 
        System.out.print("Please enter a Fraction (x/y) or integer (x): ");
        String xy = input.nextLine();
        //validate input
        while (!validFraction(xy)){
            System.out.print("Invalid Fraction, Please enter (x/y) or (x), where x and y are integers and y is greater than zero: ");
            xy = input.nextLine();
        }
        //convert to num,den
        int num=0;
        int den=0;
        if (xy.contains("/")){
            num=Integer.parseInt(xy.substring(0,xy.indexOf("/") ));
            den=Integer.parseInt(xy.substring(xy.indexOf("/")+1,xy.length() ));
        } else {
            num=Integer.parseInt(xy);
            den=1;
        }
        //return Fraction
        Fraction fracConv= new Fraction(num,den);
        return fracConv;
    }
    public static boolean validFraction(String fraction){ 
        boolean valid;
        if (fraction.startsWith("-")){
            fraction=fraction.substring(1,fraction.length());
        }
        if (fraction.contains(" ")||fraction.contains("-")||fraction.charAt(fraction.indexOf("/")+1)==('0')) {
            valid=false;
        } else if (fraction.contains("/")) { 
            fraction = fraction.replace("/", "");
        }
        if (fraction.matches("[0-9]+")){
            valid=true;
        }else{
            valid=false;
        }
        return valid;
    }
}
