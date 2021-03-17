import java.util.*;

public class EateryMain {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        EateryOrder cashier = new EateryOrder();
        String picker = "Y";
        String add = "Y";
        int counter = 1;
        
        
        while(picker.equalsIgnoreCase("Y")){
        System.out.println("TSM-3E Eatery");
        System.out.println("--------------------------");
        System.out.print("Do you want to create a new Customer Number?: Press \"Y\" for Yes and \"N\" to exit: " );
        picker = sc.nextLine();
        
        if(picker.equalsIgnoreCase("Y")){
            System.out.println("Customer Number has been created: ");
            cashier.setOrderNum(counter);
            System.out.println("Customer Number is: " + cashier.getOrderNum());
            add = "Y";
            while(add.equalsIgnoreCase("Y")){
            System.out.print("Do you want to add some orders?:  Press \"Y\" for Yes and \"N\" for No: ");
            add = sc.nextLine();
            if(add.equalsIgnoreCase("Y")){
            System.out.println("These are the available menus: ");
            cashier.showMenu();
            cashier.addOrder();
            }
            else if(add.equalsIgnoreCase("N")){  
                System.out.println("Orders are done");
                cashier.showOrder();
                cashier.totalAmount();
                System.out.println("--------------------------");
                cashier.reset();
            }
            else{
                System.out.println("Invalid Input");
                add = "Y";
            }
            }
            counter++;
            }
        else if(picker.equalsIgnoreCase("N")){
            System.out.println("Program now exiting...");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input");
            picker = "Y";
        }
        }
    }}
