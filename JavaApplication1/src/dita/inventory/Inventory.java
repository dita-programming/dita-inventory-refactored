package dita.inventory;

import dita.inventory.miscellaneous.ItemsCollection;
import dita.inventory.model.Database;
import dita.inventory.model.Item;

public class Inventory
{

    public static void main(String[] args)
    {
        Database.startConnection();
        Database.createTables();
        Item item = new Item();
        System.out.println(item.toString());
        Item item2 = new Item("football", 20, 15);
        System.out.println(item2.toString());
        Database.closeConnection();
        ItemsCollection list = new ItemsCollection();
    }

}
