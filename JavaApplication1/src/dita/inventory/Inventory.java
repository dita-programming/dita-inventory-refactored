
package dita.inventory;

import dita.inventory.model.Database;
import dita.inventory.model.ItemsModel;


public class Inventory {

   
    public static void main(String[] args) {
        Database.startConnection();
       ItemsModel item = new ItemsModel();
       System.out.println(item.toString());
       ItemsModel item2 = new ItemsModel ("football", 20, 15);
       System.out.println(item2.toString());
       Database.closeConnection();
    }
    
}
