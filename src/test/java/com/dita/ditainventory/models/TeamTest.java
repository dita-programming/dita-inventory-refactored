package com.dita.ditainventory.models;

import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michael
 */
public class TeamTest
{
    
    public TeamTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test successful team creation
     */
    @org.junit.Test
    public void testTeamCreate()
    {
        Team team = new Team("football");
        team.save();
        HashMap filters =  new HashMap();
        filters.put("name", "football");
        List result = Team.read(filters);
        assertEquals(team.toString(), result.get(0).toString());
        team.delete();
    }
    
    /**
     * Test successful team update
     */
    @org.junit.Test
    public void testTeamUpdate()
    {
        Team team = new Team("football");
        team.save();
        team.setName("tennis");
        team.save();
        HashMap filters =  new HashMap();
        filters.put("name", "tennis");
        List result = Team.read(filters);
        assertEquals(team.toString(), result.get(0).toString());
        team.delete();
    }
    
}
