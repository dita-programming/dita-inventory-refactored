package com.dita.ditainventory.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Item implements Serializable
{
    private int id;
    private String name;
    private int currentQuantity;    
    private int quantity;

    public Item()
    {
    }

    public Item(String name, int currentQuantity, int quantity)
    {
        this.name = name;
        this.currentQuantity = currentQuantity;
        this.quantity = quantity;
    }

    @Id 
    @GeneratedValue
    @Column(name = "id")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Column(name = "name")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Column(name = "current_quantity")
    public int getCurrentQuantity()
    {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity)
    {
        this.currentQuantity = currentQuantity;
    }

    @Column(name = "quantity")
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
}
