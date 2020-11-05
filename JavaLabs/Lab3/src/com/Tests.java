package com;

import java.util.Scanner;

public class Tests
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Methods List = new Methods();

        System.out.println("Insert amount of iterations in ADD: "); // 1000000
        long k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем ADD
        List.LinkedListADD(k);
        System.out.println("");
        List.ArrayListADD(k);

        System.out.println("");
        System.out.println("Insert amount of iterations in REMOVE: "); // 50000
        k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем REMOVE
        List.LinkedListREMOVE(k);
        System.out.println("");
        List.ArrayListREMOVE(k);

        System.out.println("");
        System.out.println("Insert amount of iterations in GET: "); // 20000
        k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем GET
        List.LinkedListGET(k);
        System.out.println("");
        List.ArrayListGET(k);

        System.out.println("");
        System.out.println("Insert amount of iterations in SET: "); // 20000
        k = sc.nextLong(); // вводим число итераций
        System.out.println(""); // Сравниваем SET
        List.LinkedListSET(k);
        System.out.println("");
        List.ArrayListSET(k);

        sc.close();
    }
}
