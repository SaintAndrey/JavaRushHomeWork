package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(true);
        print("f");
        print((int)5);
        print((byte)5);
        print((short)5);

    }

    static void print(int i){
        System.out.println(i);
    }
    static void print(String i){
        System.out.println(i);
    }
    static void print(boolean i){
        System.out.println(i);
    }
    static void print(byte i){
        System.out.println(i);
    }
    static void print(short i){
        System.out.println(i);
    }
    //Напишите тут ваши методы
}
