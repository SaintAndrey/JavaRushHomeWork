package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] array = new int[33];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String nextCh = it.next();
            char[] next = nextCh.toCharArray();

            for (int i = 0; i < next.length; i++) {
                for (int j = 0; j < abcArray.length; j++) {
                    if (next[i] == abcArray[j]) {
                        array[j] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < 33; i++) {
            System.out.println(abc.charAt(i) + " " + array[i]);
        }
    }

}
