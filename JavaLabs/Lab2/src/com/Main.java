package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Expression_Calculate EC1 = new Expression_Calculate();

        Scanner in = new Scanner(System.in);
        System.out.println("Insert expression: ");
        String expr = in.nextLine();
        if(expr.equals("")) return;

        double result = EC1.evaluate(expr);

        System.out.println(result);
    }
}
