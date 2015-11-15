/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dita.inventory.miscellaneous;

import dita.inventory.model.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author michael
 */
public class ItemsCollection extends ArrayList
{
    public Item first()
    {
        if(this.size() != 0)
        {
            return (Item) this.get(0);
        }
        
        return null;
    }
    
    public ItemsCollection name(String name)
    {
        List<Item> list = new ItemsCollection();
        if(this.size() != 0)
        {
            for(Iterator it = this.iterator(); it.hasNext();)
            {
                Item item = (Item) it.next();
                
                if(item.getName().equalsIgnoreCase(name))
                {
                    list.add(item);
                }
            }
        }
        
        return (ItemsCollection) list;
    }
    
    public ItemsCollection quantity(int quantity)
    {
        List<Item> list = new ItemsCollection();
        if(this.size() != 0)
        {
            for(Iterator it = this.iterator(); it.hasNext();)
            {
                Item item = (Item) it.next();
                
                if(item.getQuantity() == quantity)
                {
                    list.add(item);
                }
            }
        }
        
        return (ItemsCollection) list;
    }
    
    public ItemsCollection currentQuantity(int currentQuantity)
    {
        List<Item> list = new ItemsCollection();
        if(this.size() != 0)
        {
            for(Iterator it = this.iterator(); it.hasNext();)
            {
                Item item = (Item) it.next();
                
                if(item.getCurrentQuantity() == currentQuantity)
                {
                    list.add(item);
                }
            }
        }
        
        return (ItemsCollection) list;
    }
}
