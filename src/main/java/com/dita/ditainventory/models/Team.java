package com.dita.ditainventory.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teams")
public class Team extends Dao implements Serializable 
{
    private int id;
    private String name;

    public Team()
    {
    }

    public Team(String name)
    {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Column(name = "name", unique=true)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    } 

    @Override
    public String toString()
    {
        return "Team{" + "id=" + id + ", name=" + name + '}';
    }
}
