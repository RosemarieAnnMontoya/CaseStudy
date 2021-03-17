import java.util.*;
public class EateryOrder {
    private int cusNum;
    private int orderNum;
    private int totalAm;
    private int currentOrder;
    private final String[] availMenus = {"Adobo","Caldereta","Kare-Kare","Sinigang","Menudo","Plain Rice","Fried Rice","Egg","Hotdog",};
    private final int[] availMenuPrice = {35,40,40,30,35,15,25,10,15};
    int counterOrder = 0;
    ArrayList<String> totalOrder = new ArrayList<String>();
    ArrayList<Integer> totalOrderCount = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    
    //shows the Available Menu
    public void showMenu(){
        for(int i = 0; i < availMenus.length; i++){
            System.out.println((i+1)+"."+ availMenus[i]+" - "+availMenuPrice[i]+".00php");
        }
    }
    //sets and gets the order number
    public void setOrderNum(int on){
        orderNum = on;
    }
    public int getOrderNum(){
        return orderNum;
    }
    //Compressed to summarize orders
    public void addOrder(){
        System.out.println("Select Order: ");
            this.setOrder(sc.nextInt());
            System.out.println("Quantity: ");
            this.setOrderCount(sc.nextInt());
            this.showOrder();
            this.totalAmount();
    }
    //sets the order from the Available Menus
    public void setOrder(int o){
        totalOrder.add(availMenus[o-1]);     
        currentOrder = o-1;
    }
    //adds number of pieces of ordered menu
    public void setOrderCount(int toc){
        totalOrderCount.add(toc);
        totalAm = totalAm + (toc * availMenuPrice[currentOrder]);
        counterOrder++;
    }
    //prints out total amount
    public void totalAmount(){
        System.out.println("The total amount is now: " + totalAm + ".00 Php");
    }
    //resets order and customer number to starting
    public void reset(){
        totalAm = 0;
        totalOrder.removeAll(totalOrder);
        totalOrderCount.removeAll(totalOrderCount);
    }
    //shows the order
    public void showOrder(){
        System.out.println("Your orders are: ");
        for(int i = 0; i < totalOrder.size(); i++){
            System.out.println(totalOrderCount.get(i) + "pcs " +totalOrder.get(i));
        }
    }
    
    
}
