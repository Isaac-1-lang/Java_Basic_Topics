package Exams.intensives;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Item {
    private int id;

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    private String name;
    private int quantity;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Items [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
    }
    @Override
    public boolean equals(Object obj) {
        Item other = (Item) obj;
        // you have to remember that objects only allow .equals otherwise use ==
        return id==other.id && name.equals(other.name) && quantity == other.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quantity);
    }
}




abstract class Store {
    protected ArrayList<Item> inventory = new ArrayList<>();

    // Abstract methods for adding and removing items

    public abstract void addItem(Item item,int quantity);
    public abstract void removeItem(int itemId,int quantity);



    // Utility method to find item by id

    protected Item findItemById(int id) {
        for(Item item:inventory)
         {
             if(item.getId()==id) {
                 return item;
             }
         }
        return null;
    }


    public void displayInventory() {
        System.out.println("Inventory: ");

        for(Item item:inventory) {
            System.out.println(item);
        }
    }

}


