package com;

public class Unit
{
    int id;
    String name;

    Unit(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

  public int GetUnitId()
  { return this.id; }

  public String GetUnitName()
  { return this.name; }

}