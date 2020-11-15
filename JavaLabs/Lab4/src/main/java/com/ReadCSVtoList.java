package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVtoList
{
    //List<Employee> employees = new ArrayList<Employee>();

    public static List<Employee> ReadToList()
    {
        String filename = "D:/Java/Lab4/src/main/resources/foreign_names.csv";
        List<Employee> employees = new ArrayList<Employee>();

        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String line = br.readLine();

            line = br.readLine(); // считываем первую строку, т.к. там нет нужных данных, только названия столбцов

            for(int counter = 0; line != null; counter++)
            {
                String[] pieces = line.split(";");

                if(pieces.length < 6)
                { throw new RuntimeException("Missing elements"); }

                int id = Integer.parseInt(pieces[0]);
                String name = pieces[1];
                boolean sex = pieces[2].equals("Male");
                String birthdate = pieces[3];
                int unit_id = counter;
                String unit_name = pieces[4];
                float salary = Float.parseFloat(pieces[5]);

                Employee tmp = new Employee(id, name, sex, unit_id, unit_name, salary, birthdate);
                employees.add(tmp);

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException ioe) { ioe.printStackTrace(); }

        return employees;
    }

}
