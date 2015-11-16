
package dita.inventory.model;

public class Item implements BaseModel
{

    private String name;

    private Integer quantity;
    private Integer currentQuantity;
    private String query;

    public Item(String name, Integer quantity, Integer currentQuantity)
    {
        this.name = name;
        this.quantity = quantity;
        this.currentQuantity = currentQuantity;
    }

    public Item()
    {
        name = null;
        quantity = null;
        currentQuantity = null;
        query = null;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }

    public Integer getCurrentQuantity()
    {
        return currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity)
    {
        this.currentQuantity = currentQuantity;
    }

    @Override
    public void create()
    {
        query = "INSERT INTO Items(name,quanity,currentQuantity) VALUES(?,?,?)";
    }

    
    public static void read()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString()
    {
        return "ItemsModel{" + "name=" + name + ", quantity=" + quantity + ", currentQuantity=" + currentQuantity + ", query=" + query + '}';
    }

}
