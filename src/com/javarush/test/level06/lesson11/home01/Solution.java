package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Cоздай тут 10 объектов Cat
        Cat[] cat = new Cat[10];

        for (int i = 0; i < 10; ++i)
        {
            cat[i] = new Cat();

        }
        System.out.println(cat[9].catCount);

        //Выведи тут на экран catCount

    }

    public static class Cat
    {
        //Cоздай тут статическую переменную
        static public int catCount =0;
        public Cat(){
            this.catCount++;
        }

        //Создай тут конструктор
    }

}
