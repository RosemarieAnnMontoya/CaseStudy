package Jabile;

import java.util.*;


public class Order {
    private final ArrayList<Integer> quantity = new ArrayList<>(); 
    private final ArrayList<String> food = new ArrayList<>();
    private final ArrayList<Integer>price = new ArrayList<>();
    private int count = 0;
    
    //adds the items in the order list
    public void setOrder(int q, String f, int p){
        quantity.add(q);
        food.add(f);
        price.add(p);
        count++;
    }
    
    public int getcount(){
        return count;
    }
    public void changeQuan(int quan, int index){
        quantity.set(index, quan);
        
    }
    //gives the price
    public int getPrice(int index){
        return price.get(index);
    }
    //gives the quantitie
    public int getQuantity(int index){
        return quantity.get(index);
    }
    //gives the food
    public String getFood(int index){
        return food.get(index);
    }
}
