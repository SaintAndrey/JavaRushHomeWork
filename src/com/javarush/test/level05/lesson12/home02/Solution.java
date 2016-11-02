package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static class Man{
        String name, address;
        int age;
        public Man(String name, int age, String address){
            System.out.println("[" + name + " " + age + " " + address +"]");
        }
        public Man(String name, int age){}
        public Man(String name, String address){}
        public Man(int age, String address){}
        public Man(String name){}
        public Man(int age){}
    }
    public static class Woman {
        String name, address;
        int age;
        public Woman(String name, int age, String address){
            System.out.println("[" + name + " " + age + " " + address +"]");
        }
        public Woman(String name, int age){}
        public Woman(String name, String address){}
        public Woman(int age, String address){}
        public Woman(String name){}
        public Woman(int age){}
    }

    public static void main(String[] args)
    {
        String name, address;
        int age;
        Man man = new Man("Andrey", 19, "Saint");
        Woman woman = new Woman("Lisa", 19, "Saint");
        //создай по два объекта каждого класса тут

        //выведи их на экран тут
    }



    //добавьте тут ваши классы
}
