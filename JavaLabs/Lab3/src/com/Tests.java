package com;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tests
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Methods List = new Methods();

        List<Integer> listL = new LinkedList<Integer>();
        List<Integer> listA = new ArrayList<Integer>();

        System.out.println("Insert amount of iterations in ADD: "); // 1000000
        long k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем ADD
        System.out.println("Linked List: ");
        List.ListADD(k, listL);
        System.out.println("");
        System.out.println("Array List: ");
        List.ListADD(k, listA);

        System.out.println("");
        System.out.println("");
        System.out.println("Insert amount of iterations in REMOVE: "); // 50000
        k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем REMOVE
        System.out.println("Linked List: ");
        List.fill(k, listL); // заполняем значениями
        List.ListREMOVE(k, listL);
        System.out.println("");
        System.out.println("Array List: ");
        List.fill(k, listA); // заполняем значениями
        List.ListREMOVE(k, listA);

        System.out.println("");
        System.out.println("");
        System.out.println("Insert amount of iterations in GET: "); // 20000
        k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем GET
        System.out.println("Linked List: ");
        List.fill(k, listL); // заполняем значениями
        List.ListGET(k, listL);
        System.out.println("");
        System.out.println("Array List: ");
        List.fill(k, listA); // заполняем значениями
        List.ListGET(k, listA);

        System.out.println("");
        System.out.println("");
        System.out.println("Insert amount of iterations in SET: "); // 20000
        k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем SET
        System.out.println("Linked List: ");
        List.fill(k, listL); // заполняем значениями
        List.ListSET(k, listL);
        System.out.println("");
        System.out.println("Array List: ");
        List.fill(k, listA); // заполняем значениями
        List.ListSET(k, listA);

        sc.close();
    }
}
