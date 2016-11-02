package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        int age;
        boolean sex;
        String name;
        String sarname;
        Human wife;
        Human husband;

        Human(){}

        Human(String name){
            this.name = name;
        }

        Human(String name, String sarname){
            this.name = name;
            this.sarname = sarname;
        }

        Human(boolean sex){
            this.sex = sex;
        }

        Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        Human(String name, String sarname, boolean sex){
            this.name = name;
            this.sarname = sarname;
            this.sex = sex;
        }

        Human(int age){
            this.age = age;
        }

        Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        Human(String name, String sarname, int age){
            this.name = name;
            this.sarname = sarname;
            this.age = age;
        }

        Human(String name, String sarname, int age, boolean sex){
            this.name = name;
            this.sarname = sarname;
            this.age = age;
            this.sex = sex;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
