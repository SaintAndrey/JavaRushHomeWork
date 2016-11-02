package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg1";//напишите тут ваш код
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Zerg5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Zerg6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Zerg7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Zerg8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Zerg9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Zerg10";

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
        protos1.name = "Prot1";
        protos2.name = "Prot2";
        protos3.name = "Prot3";
        protos4.name = "Prot4";
        protos5.name = "Prot5";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "Ter1";
        terran2.name = "Ter2";
        terran3.name = "Ter3";
        terran4.name = "Ter4";
        terran5.name = "Ter5";
        terran6.name = "Ter6";
        terran7.name = "Ter7";
        terran8.name = "Ter8";
        terran9.name = "Ter9";
        terran10.name = "Ter10";
        terran11.name = "Ter11";
        terran12.name = "Ter12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}