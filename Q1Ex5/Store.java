/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex5;

/**
 *
 * @author MUON
 */
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    ArrayList<Item> itemList = new ArrayList<>();// Initialize itemList as a new ArrayList
    this.itemList = itemList;
    storeList.add(this);// add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if ((index < 0 || index >= this.itemList.size())){
        System.out.println("There are only " + this.itemList.size() + " items in the store.\n");
    }
    else {
        Item soldItem = this.itemList.get(index);
        earnings += soldItem.getCost();
        System.out.println("You sold "+soldItem.getName()+" for "+soldItem.getCost()+". You now have "+earnings+".\n");
    }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    Item soldItem = null;
    boolean isFound = false;
    for (Item e : this.itemList){
        if(e.getName().equalsIgnoreCase(name)){
            soldItem = e;
            isFound = true;
            break;
        }
        else {
            isFound = false;
        }
    }
    if (isFound == false){
        System.out.println("This store does not sell " + name + ".\n");
    }
    else {
        earnings += soldItem.getCost();
        System.out.println("You sold "+soldItem.getName()+" for "+soldItem.getCost()+". You now have "+earnings+".\n");
    }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
    
  public void sellItem(Item i){
    Item soldItem;
    if (this.itemList.contains(i)){
        soldItem = i;
        earnings += soldItem.getCost();
        System.out.println("You sold "+soldItem.getName()+" for "+soldItem.getCost()+". You now have "+earnings+".\n");
    }
    else {
        System.out.println("This store does not sell " + i.getName() + ". \n");
    }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  
  public void addItem(Item i){
    this.itemList.add(i);
    // add Item i to store's itemList
  }
  
  public void filterType(String type){
    for (Item e : this.itemList){
        if(e.getType().equals(type)){
            System.out.println(e.getName());
        }
    }
    System.out.println("\n");
    // loop over itemList and print all items with the specified type
  }
  
  public void filterCheap(double maxCost){
    //ArrayList<Item> itemList = new ArrayList<>();
    for (Item e : this.itemList){
        if(e.getCost() <= maxCost){
            System.out.println(e.getName());
        }
    }
    System.out.println("\n");
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  
  public void filterExpensive(double minCost){
    //ArrayList<Item> itemList = new ArrayList<>();
    for (Item e : this.itemList){
        if(e.getCost() >= minCost){
            System.out.println(e.getName());
        }
    }
    System.out.println("\n");
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (Store e : storeList){
        System.out.println(e.getName() + " - " + e.getEarnings());
    }
  }
  
}
