package com.dita.ditainventory.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Members")
public class Member implements Serializable
{
    private String id;
    private String name;
    private Team team;

    public Member()
    {
    }

    public Member(String id, String name, Team team)
    {
        this.id = id;
        this.name = name;
        this.team = team;
    }

    @Id
    @Column(name = "member_id", nullable=false)
    public String getId()
    {
        return id;
    }

    public void setId(String id)
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

    @ManyToOne(cascade=CascadeType.ALL)
    public Team getTeam()
    {
        return team;
    }

    public void setTeam(Team team)
    {
        this.team = team;
    }
}
