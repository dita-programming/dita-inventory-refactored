package com.dita.ditainventory;

import com.dita.ditainventory.models.Team;

public class Inventory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Team team = new Team("football");
        team.save();
        System.out.println("success");
    }
    
}
