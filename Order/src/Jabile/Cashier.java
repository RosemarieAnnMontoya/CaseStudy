package Jabile;

public class Cashier {
    
    private String dateAndTime;
    private int totalammount;
    
    //calculates for the total ammount of the order given and returns the total ammount.
    public int calcuTotal(Order order){
        for(int i = 0;i<order.getcount();i++){
            totalammount += (order.getPrice(i)* order.getQuantity(i));
        }
        return totalammount;
    }
    
    //calculates and return the total ammount of change
    public int calcuChange(int cash){
        int change= cash - totalammount;
        return change;
    }
            
}
