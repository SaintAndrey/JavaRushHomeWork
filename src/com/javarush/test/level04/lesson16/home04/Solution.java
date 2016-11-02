package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sy = bufferedReader.readLine(), sm = bufferedReader.readLine(), sd = bufferedReader.readLine();
        int y = Integer.parseInt(sy), m = Integer.parseInt(sm), d = Integer.parseInt(sd);

        System.out.println("Меня зовут " + name + "\nЯ родился " + d + "." + m + "." + y);
    }
}
