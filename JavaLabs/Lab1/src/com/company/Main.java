package com.company;

class Container // Класс контейнер отслеживает 2 значения - свою длину и содержимое
{
    private int length;
    private String[] food;


    public Container() // Конструктор контейнера без параметров
    {
        length = 0;
        food = null;
    }


    public Container(int length) // Конструктор контейнера заданной длины
    {
        if (length > 0) food = new String[length];
        else food = null;
    }


    void erase() // Очистка контейнера
    {
        for (int i = 0; i < length; i++) food[i] = null;
        food = null;
        length = 0;
    }


    int getLength() { return length; } // Метод для получения длины контейнера


    String getFood (int i) { return food[i]; } // Метод для извлечения элемента с указанным индексом из контейнера

    void add(String food_name) // Добавляем элемент в конец контейнера
    {
        // Создаём массив на 1 больше старого
        String[] New_food = new String[length + 1];

        // Копируем все элементы до последнего
        System.arraycopy(food,0,New_food,0, length);

        // Вставляем новый элемент на последнее место массива
        New_food[length] = food_name;

        food = New_food;
        ++length;

    }
/*
    void resize(int New_length) // Изменяем длину контейнера на newLength
    {
        if(New_length == length) return; // Если требуемая длина совпадает с текущей
        if (New_length == 0) { erase(); return; } // Если новая длина нулевая

        //Если новая длина >=1

        //Создаём новый контейнер
        String[] New_food = new String[New_length];


        if(length > 0)
        {
            // Считаем количество элементов, которые нужно скопировать, оно равно количеству элементов в контейнере меньшей длины
            int ElementsCount = Math.min(length, New_length); // (New_length > length) ? length : New_length;

            // Копируем элементы в новый контейнер
            System.arraycopy(food,0, New_food,0, ElementsCount); // for(int i = 0; i < ElementsCount; ++i) New_food[i] = food[i];

        }

        food = New_food;
        length = New_length;
    }
*/

    void add(String foodname, int ind) // Добавляем элемент в контейнер по индексу
    {
        // Создаём массив на 1 больше старого
        String[] New_food = new String[length + 1];

        // Копируем все элементы до индекса ind
        for(int i = 0; i < ind; ++i) New_food[i] = food[i]; //System.arraycopy(food,0,New_food,0, ind);

        // Вставляем новый элемент на i-е место массива
        New_food[ind] = foodname;

        // Копируем все элементы после индекса i
        for(int i = ind; i < length; ++i) New_food[i+1] = food[i]; //System.arraycopy(food,ind,New_food,ind+1, length);

        food = New_food;
        ++length;
    }


    void remove(int ind) // Удаляем элемент из контейнера по индексу
    {
        // Если в контейнере 1 элемент
        if(length == 1) { erase(); return; }

        // Создаём массив на 1 элемент меньше
        String[] New_food = new String[length - 1];

        // Копируем все элементы до индекса i
        for(int i = 0; i < ind; ++i) New_food[i] = food[i]; //System.arraycopy(food, 0, New_food, 0, i);

        // Копируем все элементы после i
        for(int i = ind+1; i < length; ++i) New_food[i-1] = food[i]; //System.arraycopy(food,i+1,New_food,i, length);

        food = New_food;
        --length;
    }

}



public class Main {

    public static void main(String[] args)
    {
        // контейнер холодильник вмещающий 4 элемента
        Container Fridge = new Container(4);

        // добавляем в холодильник продуктов
        Fridge.add("Cucumber");
        Fridge.add("Bread");
        Fridge.add("Milk");
        Fridge.add("Butter");

        // Выводим список еды в холодильнике
        for(int i = 0; i < Fridge.getLength(); i++)
            System.out.println(Fridge.getFood(i));

        // добавляем яйца между огурцом и хлебом
        Fridge.add("Eggs", 1);

        // выводим текущую вместимость холодильника
        System.out.print(Fridge.getLength());

        // Выводим список еды в холодильнике
        for(int i = 0; i < Fridge.getLength(); i++)
            System.out.println(Fridge.getFood(i));

        // Убираем масло, уменьшая холодильник
        Fridge.remove(4);

        // Выводим список еды в холодильнике
        for(int i = 0; i < Fridge.getLength(); i++)
            System.out.println(Fridge.getFood(i));

    }
}
