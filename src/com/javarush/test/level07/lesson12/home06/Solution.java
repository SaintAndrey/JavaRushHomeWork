package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human Pavel1 = new Human("Павел1", true , 55);
        Human Kate1 = new Human("Катя1", false, 55);
        Human Pavel = new Human("Павел", true , 55);
        Human Kate = new Human("Катя", false, 55);
        Human Ane = new Human("Аня", false, 21, Pavel, Kate);
        Human Mechail = new Human("Михаил", true, 22, Pavel1, Kate1);
        Human Igor = new Human("Игорь", true, 2, Mechail, Ane);
        Human Igor2 = new Human("Игорь2", true, 2, Mechail, Ane);
        Human Igor3= new Human("Игорь3", true, 2, Mechail, Ane);

        System.out.println(Pavel1.toString());
        System.out.println(Kate1.toString());
        System.out.println(Pavel.toString());
        System.out.println(Kate.toString());
        System.out.println(Ane.toString());
        System.out.println(Mechail.toString());
        System.out.println(Igor.toString());
        System.out.println(Igor2.toString());
        System.out.println(Igor3.toString());

        //напишите тут ваш код
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
