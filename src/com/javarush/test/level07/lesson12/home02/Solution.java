package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            list1.add(reader.readLine());

        for (int i = 0; i < n-m; ++i)
            list2.add(list1.get(i+m));
        for (int i = 0; i <m; ++i)
            list2.add(list1.get(i));
        //напишите тут ваш код
        for (int i = 0; i < list2.size(); ++i)
            System.out.println(list2.get(i));
    }
}
