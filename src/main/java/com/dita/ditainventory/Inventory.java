package com.dita.ditainventory;

import com.dita.ditainventory.models.Team;
import java.util.HashMap;

public class Inventory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Team team1 = new Team("football");
        team1.save();
        Team team2 = new Team("volleyball");
        team2.save();
        System.out.println(Team.read(new HashMap()).toString());
        Team.close();
    }
    
}
