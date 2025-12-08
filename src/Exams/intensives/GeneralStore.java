package Exams.intensives;

public class GeneralStore  extends Store{
    @Override
    public void addItem(Item item,int quantity) {
        Item existingItem = findItemById(item.getId());

        if(existingItem!=null &&  existingItem.getQuantity() > 0) {
            // Increase quantity if item exists
            existingItem.setQuantity(existingItem.getQuantity()+quantity);
        } else {
            // Add new item then create is as a new quantity
            if(quantity>0) {
                item.setQuantity(quantity);
                inventory.add(item);
            } else {
                System.out.println("Please enter an integer greater than 0");
            }


        }


        System.out.println(quantity + item.getName()+ "(s) added to inventory");
    }


    @Override
    public void removeItem(int itemId,int quantity) {

        Item existingItem = findItemById(itemId);
        if(existingItem!=null && quantity <= existingItem.getQuantity() && quantity > 0) {
            existingItem.setQuantity(existingItem.getQuantity()-quantity);
            System.out.println(quantity + "(s) removed from inventory");
        } else if(quantity>0)
            {
                System.out.println("Please enter an integer greater than 0");
            } else{
                System.out.println("Product not found in inventory");
                return;
        }
    }
}
