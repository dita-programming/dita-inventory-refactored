/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dita.inventory.model;

/**
 *
 * @author LYDIA
 */
public class ItemsModel implements BaseModel{
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
private Integer quantity;
private Integer currentQuantity;
private String query;

    public ItemsModel(String name, Integer quantity, Integer currentQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.currentQuantity = currentQuantity;
    }

    public ItemsModel() {
        name = null;
        quantity = null;
        currentQuantity = null;
        query = null;
    }


    @Override
    public void create() 
    {
        query = "INSERT INTO Items(name,quanity,currentQuantity) VALUES(?,?,?)";
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ItemsModel{" + "name=" + name + ", quantity=" + quantity + ", currentQuantity=" + currentQuantity + ", query=" + query + '}';
    }
    
    
}
