package Exams.intensives;

public class Main2 {

    public static void main(String[] args) {
        GeneralStore store = new GeneralStore();

        Item item1 = new Item(1,"Apple",12);
        Item item2 = new Item(2,"Banana",13);


        store.addItem(item1,50);
        store.addItem(item2,50);
        store.removeItem(1,2);
        store.removeItem(2,50);
        store.removeItem(3,2);
        store.removeItem(1,-2);



        store.displayInventory();
    }
}
