package Jabile;

import java.util.*;

public class Jabile {
    
    
    Cashier cash1 = new Cashier();
    
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        Jabile obj = new Jabile();
    System.out.println(" ---------------------------------------------");
    System.out.println("|                                             |");
    System.out.println("|              WELCOME TO JABILE!             |");
    System.out.println("|            HOW MAY WE SERVE YOU?            |");
    System.out.println("|                                             |");
    System.out.println(" ---------------------------------------------\n");
    obj.displayMenu(sc);
    
    }
    
    //just display the menu and creates a new order object
    public void displayMenu(Scanner sc){
    Order order = new Order();
    System.out.println(" ---------------------------------------------");
    System.out.println("|                     MENU                    |");
    System.out.println("|---------------------------------------------|");
    System.out.println("|  [Index]PACKAGES   -----------------  PRICE |");
    System.out.println("|---------------------------------------------|");
    System.out.println("|                                             |");
    System.out.println("|  [1]Food package #1  -----------------  $99 |");
    System.out.println("|  (1 rice, 1 Chicken, M Drink)               |");
    System.out.println("|  [2]Food package #2  -----------------  $89 |");
    System.out.println("|  (1 Pasta, 1 Chicken, M Drink)              |");
    System.out.println("|  [3]Food package #3  -----------------  $69 |");
    System.out.println("|  (1 burge, M fries, M Drink)                |");
    System.out.println("|  [4]Food package #4  ----------------- $119 |");
    System.out.println("|  (1 rice, 2 Chicken, M Drink)               |");
    System.out.println("|                                             |");
    System.out.println("|  [0]Exit                                    |");
    System.out.println(" ---------------------------------------------\n");
    takefood(sc, order);
    }
    
    //takes what package you are buying
    public void takefood(Scanner sc ,Order order){
        
        int pack;
        System.out.print("What is you order? : ");
        pack = sc.nextInt();
        switch(pack){
            case 1:
                takequantity(sc, "FP#1", 99,order);
                break;
            case 2:
                takequantity(sc, "FP#2", 89,order);
                break;
            case 3:
                takequantity(sc, "FP#3", 69,order);
                break;
            case 4:
                takequantity(sc, "FP#4", 119,order);
                break;
            case 0:
                System.out.println(" ---------------------------------------------");
                System.out.println("|                                             |");
                System.out.println("|            THANK YOU COME AGAIN!            |");
                System.out.println("|                                             |");
                System.out.println(" ---------------------------------------------\n");
                System.exit(0);
                break;
            default:
            System.out.println("Sorry, we don't have that here.");
                takefood(sc, order);
                break;
        }
    }
           
    //how many are you buying
    public void takequantity(Scanner sc, String name, int price, Order order){
        int quantity;
        boolean temp = false;
        System.out.print("how many order? : ");
        quantity = sc.nextInt();
        int i = checkOrder(sc);
        switch(i){
            case 0:
                takequantity(sc, name, price,order);
                break;
            case 1:
                if(order.getcount()!=0){
                    for(int j = 0; i<order.getcount();j++){
                        if(order.getPrice(j)==price){
                        quantity += order.getQuantity(j);
                        order.changeQuan(quantity, j);
                        temp = true;
                        }    
                    }
                }
                break;
        }
        if(!temp){
            order.setOrder(quantity, name, price);
        }
        orderAgain(sc, order);
    }
    
    //check if you already buy the same item
    public int checkOrder(Scanner sc){
        System.out.print("Are you sure? (1 - YES | 0 - NO): ");
        int i = sc.nextInt();
        switch(i){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                System.out.print("Invalid entry! 1 for YES and 0 for NO only!");
                checkOrder(sc);
                break;
        }
        return 0;
    }
    
    
    public void orderAgain(Scanner sc,Order order){
        System.out.print("Is that all your order? (1 - YES | 0 - NO): ");
        int i = sc.nextInt();
        switch(i){
            case 0:
                takefood(sc, order);
                break;
            case 1:
                billOut(sc, order);
                break;
            default:
                System.out.print("Invalid entry! 1 for YES and 0 for NO only!");
                orderAgain(sc, order);
                break;
        }  
    }
    
    //shows you your bill
    public void billOut(Scanner sc, Order order){
        System.out.println("\nYour order is: ");
        for(int i = 0;i<order.getcount();i++){
            System.out.println(order.getQuantity(i)+"x "+ order.getFood(i)+ " for "+ order.getPrice(i));
        }
        System.out.println("For the total ammount of: "+cash1.calcuTotal(order));
        payCash(sc, order);
    }
    
    //input how much are you paying
    public void payCash(Scanner sc, Order order){
        System.out.print("\nInput cash payment: ");
        int cash = sc.nextInt();
        int change = cash1.calcuChange(cash);
        if(change < 0){
            System.out.println("Insufficient Fund, Try Again!");
            payCash(sc, order);
        }else{
            System.out.println("Your Change is "+ change);
            System.out.println("THANK YOU, COME AGAIN!\n\n");
            displayMenu(sc);
        }
    }
      
}
