package com;

public class Employee
{
    int id;
    String name;
    boolean sex; // false - woman; true - man;
    Unit unit;
    float salary;
    String birthdate;

    Employee(int id, String name, boolean sex, int unit_id, String unit_name, float salary, String birthdate)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.unit = new Unit(unit_id, unit_name);
        this.salary = salary;
        this.birthdate = birthdate;
    }


    public void printEmp()
    {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.sex);
        System.out.println(this.unit.GetUnitId());
        System.out.println(this.unit.GetUnitName());
        System.out.println(this.salary);
        System.out.println(this.birthdate);
        System.out.println("");
        System.out.println("");
    }



}