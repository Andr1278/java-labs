package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Methods
{
    public void ListADD(long k, List<Integer> list) // Время и количество итераций ADD
    {
        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            list.add(i);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("ADD time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

    public void fill(long k, List<Integer> list)
    {
        list.clear(); // очищаем список

        for (int i = 0; i < k; i++) // Заполняем
        { list.add(i); }
    }

    public void ListREMOVE(long k, List<Integer> list) // Время и количество итераций REMOVE
    {
        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            list.remove(0);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("REMOVE time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }


    public void ListGET(long k, List<Integer> list) // Время и количество итераций GET
    {
        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            list.get(i);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("GET time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

    public void ListSET(long k, List<Integer> list) // Время и количество итераций SET
    {
        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            list.set(i, 10);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("SET time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

}
