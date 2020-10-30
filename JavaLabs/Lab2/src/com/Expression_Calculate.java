package com;


public class Expression_Calculate
{
    // Определяем всевозможные типы символов
    final int Sign = 1; // Арифметический знак или скобки
    final int Var = 2; // Переменная
    final int Num = 3; // Число

    // Определяем всевозможные виды ошибок
    final int div0 = 0; // Деление на 0
    final int Par = 1; // Несовпадение скобок
    final int syntax = 2; // Синтаксическая ошибка
    final int Expr = 3; // Отсутствует выражение

    private String expression; // ссылка на строку с выражением
    private int index; // Текущий индекс в выражении
    private String Symbol; // Текущий символ
    private int SymbolType; // Тип символа


    private boolean isSign(char simb) // Метод для определения, является ли символ арифм. знаком или скобками
    {
        if(simb == '+' || simb == '-' || simb =='/' || simb == '*' || simb =='=' || simb == '(' || simb == ')' || simb == '^')
            return true;
        return false;
    }


    private void showError(int num) // показать ошибку
    {
        switch (num)
        {
            case 0: System.out.println("Division by 0"); break;
            case 1: System.out.println("Parentheses mismatch"); break;
            case 2: System.out.println("Syntax error"); break;
        }
    }


    private void getSybmol() // Метод получения следующего символа из формулы
    {
        SymbolType = 0;
        Symbol = "";

        if(index == expression.length()) // Проверяем на окончание выражения
        {
            Symbol = "\0";
            return;
        }

        while(index < expression.length() && Character.isWhitespace(expression.charAt(index))) // Пропускаем пробелы
            ++index;

        if(index == expression.length()) // Проверяем на окончание выражения
        {
            Symbol = "\0";
            return;
        }

        // Определяем к какому типу относится символ

        if(isSign(expression.charAt(index))) // Если знак
        {
            Symbol += expression.charAt(index);
            index++;
            SymbolType = Sign;
        }

        else if(Character.isLetter(expression.charAt(index))) // Если переменная
        {
            while(!isSign(expression.charAt(index)))
            {
                Symbol += expression.charAt(index);
                index++;
                if(index >= expression.length()) break;
            }
            SymbolType = Var;
        }

        else if(Character.isDigit(expression.charAt(index))) // Если число
        {
            while(!isSign(expression.charAt(index)))
            {
                Symbol += expression.charAt(index);
                index++;
                if(index >= expression.length()) break;
            }
            SymbolType = Num;
        }

        else // иначе конец файла
        {
            Symbol = "\0";
            return;
        }
    }


    private double Par_Proc() // Метод обработки содержимого скобок
    {
        double res;

        if(Symbol.equals('('))
        {
            getSybmol();
            res = Sum_Dif();
            if(!Symbol.equals(')'))
            {
                showError(Par);
                return -1;
            }
            getSybmol();
        }
        else res = getValue();
        return res;
    }


    private double getValue() // Метод для получения значения числа
    {
        double res = 0.0;
        switch (SymbolType)
        {
            case Num:
                try { res = Double.parseDouble(Symbol); }
                catch (NumberFormatException exc) { showError(syntax); }
                getSybmol();
                break;

            default:
                showError(syntax);
                break;
        }
        return res;
    }


    public double evaluate(String expr) // Определяем точку начала выражения
    {
        double res;

        expression = expr;
        index = 0;
        getSybmol();
        if(Symbol.equals("\0")) showError(Expr);
        res = Sum_Dif();
        if(!Symbol.equals("\0")) showError(syntax);
        return res;
    }


    private double Exp() // Возведение в степень рекурсивно
    {
        double res = Par_Proc();
        double curr;
        double temp;

        if(Symbol.equals('^'))
        {
            getSybmol();
            curr = Exp();
            temp = res;
            if (curr == 0.0) res = 1.0;
            else for (int i = (int) curr - 1; i > 0; i--) res += temp;
        }
         return res;
    }


   private double Mult_Div() // Умножение и деление
   {
       char sign = Symbol.charAt(0);
       double res = Exp();
       double curr;

       while (sign == '*' || sign == '/')
       {
           getSybmol();
           curr = Exp();
           switch (sign)
           {
               case '*':
                   res *= curr;
               case '/':
                   if(curr == 0.0)
                   {
                       showError(div0);
                       return -1;
                   }
                   else
                       {
                       res /= curr;
                       break;
                       }
           }
       }
       return res;
   }

    private double Sum_Dif() // Сложение и вычитание
    {
        char sign = Symbol.charAt(0);
        double res = Mult_Div();
        double curr;

        while (sign == '+' || sign == '-')
        {
            getSybmol();
            curr = Mult_Div();
            switch (sign)
            {
                case '+':
                    res += curr;
                    break;
                case '-':
                    res -= curr;
                    break;
            }
        }
        return res;
    }


}
