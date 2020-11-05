package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Methods
{
    public void LinkedListADD(long k) // Время и количество итераций LinkedList ADD
    {
        long StartTime = new Date().getTime(); // Засекаем время
        List<Integer> LinkedList = new LinkedList<Integer>();
        for (int i = 0; i < k; i++)
        {
            LinkedList.add(i);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("LinkedList ADD time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

    public void LinkedListREMOVE(long k) // Время и количество итераций LinkedList REMOVE
    {

        List<Integer> LinkedList = new LinkedList<Integer>();

        for (int i = 0; i < k; i++) // Заполняем
        {
            LinkedList.add(i);
        }

        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            LinkedList.remove(0);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("LinkedList REMOVE time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }


    public void LinkedListGET(long k) // Время и количество итераций LinkedList GET
    {

        List<Integer> LinkedList = new LinkedList<Integer>();

        for (int i = 0; i < k; i++) // Заполняем
        {
            LinkedList.add(i);
        }

        long StartTime = new Date().getTime(); // Засекаем время

        for (int i = 0; i < k; i++)
        {
            LinkedList.get(i);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("LinkedList GET time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }


    public void LinkedListSET(long k) // Время и количество итераций LinkedList SET
    {
        List<Integer> LinkedList = new LinkedList<Integer>();

        for (int i = 0; i < k; i++) // Заполняем
        {
            LinkedList.add(i);
        }

        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            LinkedList.set(i, 10);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("LinkedList SET time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }


    public void ArrayListADD(long k) // Время и количество итераций ArrayList ADD
    {
        long StartTime = new Date().getTime(); // Засекаем время
        List<Integer> ArrayList = new ArrayList<Integer>();
        for (int i = 0; i < k; i++)
        {
            ArrayList.add(i);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("ArrayList ADD time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

    public void ArrayListREMOVE(long k) // Время и количество итераций ArrayList REMOVE
    {
        List<Integer> ArrayList = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) // Заполняем
        {
            ArrayList.add(i);
        }

        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            ArrayList.remove(0);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("ArrayList REMOVE time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

    public void ArrayListGET(long k) // Время и количество итераций ArrayList ADD
    {
        List<Integer> ArrayList = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) // Заполняем
        {
            ArrayList.add(i);
        }

        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            ArrayList.get(i);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("ArrayList GET time(ms): " + (EndTime - StartTime)); // Время выполнения  в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

    public void ArrayListSET(long k) // Время и количество итераций ArrayList SET
    {
        List<Integer> ArrayList = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) // Заполняем
        {
            ArrayList.add(i);
        }

        long StartTime = new Date().getTime(); // Засекаем время
        for (int i = 0; i < k; i++)
        {
            ArrayList.set(i, 10);
        }
        long EndTime = new Date().getTime(); // Конечное время
        System.out.println("ArrayList SET time(ms): " + (EndTime - StartTime)); // Время выполнения в миллисекундах
        System.out.println("Iteration amount: " + k); // Количество итераций
    }

}
